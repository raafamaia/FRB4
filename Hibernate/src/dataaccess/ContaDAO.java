package dataaccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Conta;

public class ContaDAO extends GenericDAO<Conta> {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public ContaDAO(){
		this.emf = Persistence.createEntityManagerFactory("default");
		this.em = emf.createEntityManager();
	}
	
	public void inserir(Conta u){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(u);
	    tx.commit();
	}
	
	public List<Conta> listar(){
		Query q = em.createQuery("select a from Conta a", Conta.class);
		return q.getResultList();
	}
	
	public Conta getByUserId(long userId){
		Query q = em.createQuery("select a from Conta a WHERE a.id = "+ userId, Conta.class);
		return (Conta) q.getSingleResult();
	}
	
}
