package model;

public class Comodin_Llamada {
	
	private Boolean usado;
	private Respuesta respuestaLlamada;
	
	public Comodin_Llamada(Boolean usado, Respuesta respuestaLlamada) {
		this.usado = usado;
		this.respuestaLlamada = respuestaLlamada;
	}
	public Boolean getUsado() {
		return usado;
	}
	public void setUsado(Boolean usado) {
		this.usado = usado;
	}
	public Respuesta getRespuestaLlamada() {
		return respuestaLlamada;
	}
	public void setRespuestaLlamada(Respuesta respuestaLlamada) {
		this.respuestaLlamada = respuestaLlamada;
	}
	@Override
	public String toString() {
		return "Comodin_Llamada [usado=" + usado + ", respuestaLlamada=" + respuestaLlamada + "]";
	}
}
