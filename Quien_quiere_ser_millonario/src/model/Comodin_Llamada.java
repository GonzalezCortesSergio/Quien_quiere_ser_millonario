package model;

public class Comodin_Llamada {
	
	private boolean usado;
	private Respuesta respuestaLlamada;
	
	public Comodin_Llamada(boolean usado, Respuesta respuestaLlamada) {
		this.usado = usado;
		this.respuestaLlamada = respuestaLlamada;
	}
	
	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
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
