package model;

public class Jugador {
	private String nombre;
	private Comodin_Descarte comodin_Descarte;
	private Comodin_Llamada comodin_Llamada;
	private Comodin_Publico comodin_Publico;
	public Jugador(String nombre, Comodin_Descarte comodin_Descarte, Comodin_Llamada comodin_Llamada,
			Comodin_Publico comodin_Publico) {
		this.nombre = nombre;
		this.comodin_Descarte = comodin_Descarte;
		this.comodin_Llamada = comodin_Llamada;
		this.comodin_Publico = comodin_Publico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Comodin_Descarte getComodin_Descarte() {
		return comodin_Descarte;
	}
	public void setComodin_Descarte(Comodin_Descarte comodin_Descarte) {
		this.comodin_Descarte = comodin_Descarte;
	}
	public Comodin_Llamada getComodin_Llamada() {
		return comodin_Llamada;
	}
	public void setComodin_Llamada(Comodin_Llamada comodin_Llamada) {
		this.comodin_Llamada = comodin_Llamada;
	}
	public Comodin_Publico getComodin_Publico() {
		return comodin_Publico;
	}
	public void setComodin_Publico(Comodin_Publico comodin_Publico) {
		this.comodin_Publico = comodin_Publico;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", comodin_Descarte=" + comodin_Descarte + ", comodin_Llamada="
				+ comodin_Llamada + ", comodin_Publico=" + comodin_Publico + "]";
	}
	
	
}
