package model;

import java.util.Arrays;

public class Comodin_Descarte {
	
	private boolean usado;
	private Respuesta []respuestaADescartar;
	
	public Comodin_Descarte(boolean usado, Respuesta[] respuestaADescartar) {
		
		this.usado = usado;
		this.respuestaADescartar = respuestaADescartar;
	}
	
	public boolean isUsado() {
		return usado;
	}


	public void setUsado(boolean usado) {
		this.usado = usado;
	}


	public Respuesta[] getRespuestaADescartar() {
		return respuestaADescartar;
	}

	public void setRespuestaADescartar(Respuesta[] respuestaADescartar) {
		this.respuestaADescartar = respuestaADescartar;
	}

	@Override
	public String toString() {
		return "Comodin_Descarte [usado=" + usado + ", respuestaADescartar=" + Arrays.toString(respuestaADescartar)
				+ "]";
	}
}
