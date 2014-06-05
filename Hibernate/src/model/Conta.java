package model;

import javax.persistence.*;

@Entity
public class Conta {
	
	@Id @GeneratedValue
	private int id;
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
	private Usuario usuario;
	private double montante;

	public Conta(){
		this.id = (int) Math.floor(Math.random() * 1000);
		this.montante = 0;
	}
	
	public Conta(Usuario idUser) {
		this.id = (int) Math.floor(Math.random() * 1000);
		this.montante = 0;
		this.usuario = idUser;
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
