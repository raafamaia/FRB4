//package dataaccess;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import model.Aluno;
//
///*TODO Remover esta classe após o script tiver sido criado */
//public class ListaAlunoDAO {
//
//	private static List<Aluno> listAlunos = new ArrayList<>();
//	
//	public ListaAlunoDAO(){}
//	
//	public void inserir(Aluno a){
//		listAlunos.add(a);
//	}
//	
//	public void removerPorNome(String nome){
//		for (int i = 0; i < listAlunos.size(); i++) {
//			if (nome.equals(listAlunos.get(i).getNome())) {
//				listAlunos.remove(i);
//				return;
//			}
//		}
//	}
//	
//	public void removerPorRa(int ra){
//		for (int i = 0; i < listAlunos.size(); i++) {
//			if (ra == listAlunos.get(i).getRa()) {
//				listAlunos.remove(i);
//				return;
//			}
//		}
//	}
//	
//	public Aluno buscaPorRa(int ra){
//		for (int i = 0; i < listAlunos.size(); i++) {
//			if (ra == listAlunos.get(i).getRa()) {
//				return listAlunos.get(i);
//			}
//		}
//		return null;
//	}
//	
//	public List<Aluno> getLista(){
//		return listAlunos;
//	}
//}
