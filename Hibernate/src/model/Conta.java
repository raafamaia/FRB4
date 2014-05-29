package model;

public class Conta {
	private int cod;
	private int idUsuario;
	private double montante;

	public Conta(){
		this.cod = (int) Math.floor(Math.random() * 1000);
		this.montante = 0;
	}
	
	public Conta(int idUser) {
		this.cod = (int) Math.floor(Math.random() * 1000);
		this.montante = 0;
		this.idUsuario = idUser;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
