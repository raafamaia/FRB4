package dataaccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Documento;
import model.Usuario;

/*TODO Refazer classe quando for feito o banco de dados*/
public class UsuarioDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public UsuarioDAO(){
		this.emf = Persistence.createEntityManagerFactory("default");
		this.em = emf.createEntityManager();
	}
	
	public void persistManager(Usuario u){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(u);
	    tx.commit();
		em.close();
	}
	
	public void persistManager(Documento d){
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(d);
	    tx.commit();
		em.close();
	}
	
	public List<Usuario> listar(){
		Query q = em.createQuery("select a from Usuario a", Usuario.class);
		return q.getResultList();
	}
	
}
