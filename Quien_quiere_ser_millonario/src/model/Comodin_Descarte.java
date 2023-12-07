package model;

import java.util.Arrays;

public class Comodin_Descarte {
	
	private Boolean usado;
	private Respuesta []respuestaADescartar;
	
	public Comodin_Descarte(Boolean usado, Respuesta[] respuestaADescartar) {
		
		this.usado = usado;
		this.respuestaADescartar = respuestaADescartar;
	}

	public Boolean getUsado() {
		return usado;
	}

	public void setUsado(Boolean usado) {
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
