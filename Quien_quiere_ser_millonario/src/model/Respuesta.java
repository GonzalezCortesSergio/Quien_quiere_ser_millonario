package model;

public class Respuesta {
	
	private String respuesta;
	private Boolean correcto;
	
	public Respuesta(String respuesta, Boolean correcto) {
		this.respuesta = respuesta;
		this.correcto = correcto;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public Boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(Boolean correcto) {
		this.correcto = correcto;
	}

	public Boolean getCorrecto() {
		return correcto;
	}
	
	@Override
	public String toString() {
		return "Respuesta [respuesta=" + respuesta + ", correcto=" + correcto + "]";
	}
	
}
