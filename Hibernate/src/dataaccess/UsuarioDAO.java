package dataaccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Conta;
import model.Documento;
import model.Usuario;

public class UsuarioDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public UsuarioDAO(){
		this.emf = Persistence.createEntityManagerFactory("default");
		this.em = emf.createEntityManager();
	}
	
	public void inserir(Usuario u){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(u);
	    tx.commit();
	}
	
	public void inserirConta(Conta u){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(u);
	    tx.commit();
	}
	
	public void inserirDocumento(Documento d){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(d);
	    tx.commit();
	}
	
	public List<Usuario> listar(){
		Query q = em.createQuery("select a from Usuario a", Usuario.class);
		return q.getResultList();
	}
	
	public Usuario findUserById(long id){
		Usuario user = em.find(Usuario.class, id);
		if(user == null){
			System.out.println("Não encontrado!");
		}
		return user;
	}
	
	public Conta findContaByUserId(long userId){
		Conta conta = em.find(Conta.class, userId);
		if(conta == null){
			System.out.println("Não encontrado!");
		}
		return conta;
	}
	
}
