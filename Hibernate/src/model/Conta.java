package model;

import javax.persistence.*;

import dataaccess.UsuarioDAO;

@Entity
public class Conta {
	
	@Id @GeneratedValue
	private int id;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
	private Usuario usuario;
	
	private double montante;

	public Conta(){
		this.montante = 0;
	}
	
	public Conta(long l) {
		this.montante = 0;
		this.usuario = new UsuarioDAO().findUserById(l);
	}
	
	public int getCod() {
		return id;
	}

	public void setCod(int cod) {
		this.id = cod;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario idUsuario) {
		this.usuario = idUsuario;
	}
	
}
