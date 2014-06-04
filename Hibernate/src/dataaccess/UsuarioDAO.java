package dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

/*TODO Refazer classe quando for feito o banco de dados*/
public class UsuarioDAO {

	private static List<Usuario> listUsuarios = new ArrayList<>();
	
	public UsuarioDAO(){}
	
	public void persistManager(Usuario u){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();
		tx.begin();
	    em.persist(u);
	    tx.commit();
		em.close();
	}
	
	public boolean autentica(String user, String senha){
		for (int i = 0; !listUsuarios.isEmpty() && i < listUsuarios.size(); i++) {
			if (listUsuarios.get(i).getNome().equals(user) && listUsuarios.get(i).getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> registros(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Usuario a", Usuario.class);
		return q.getResultList();
		
	}
	
}
