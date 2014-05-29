package model;

public class Conta {
	private int cod;
	private Usuario usuario;
	private double montante;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double getMontante() {
		return montante;
	}
	public void setMontante(double montante) {
		this.montante = montante;
	}
}
