package dataaccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

//TODO DAO Generico 
public class GenericDAO<T> {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public GenericDAO(){
		this.emf = Persistence.createEntityManagerFactory("default");
		this.em = emf.createEntityManager();
	}
	
	public void inserir(T t){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(t);
	    tx.commit();
	}
	
	public List<T> listar(Class<T> t){
		Query q = em.createQuery("select u from "+ t.getClass().getName() +" u", t.getClass());
		return q.getResultList();
	}
	
	public T getById(Class<T> t, long id){
		Query q = em.createQuery("select u from "+ t.getClass().getName() +" u WHERE a.id = :id", t.getClass());
		return (T) q.getSingleResult();
	}
	
}
