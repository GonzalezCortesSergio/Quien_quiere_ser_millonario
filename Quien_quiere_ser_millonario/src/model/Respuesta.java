package model;

public class Respuesta {
	
	private String respuesta;
	private boolean correcto;
	
	public Respuesta(String respuesta, boolean correcto) {
		this.respuesta = respuesta;
		this.correcto = correcto;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}


	@Override
	public String toString() {
		return "Respuesta [respuesta=" + respuesta + ", correcto=" + correcto + "]";
	}
	
}
