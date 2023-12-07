package model;

import java.util.Arrays;

public class Pregunta {

	private int codigoPregunta;
	private String pregunta;
	private Respuesta[] respuestas;

	public Pregunta(int codigoPregunta, String pregunta, Respuesta[] respuestas) {
		this.codigoPregunta = codigoPregunta;
		this.pregunta = pregunta;
		this.respuestas = respuestas;
	}

	public int getCodigoPregunta() {
		return codigoPregunta;
	}

	public void setCodigoPregunta(int codigoPregunta) {
		this.codigoPregunta = codigoPregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Respuesta[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Respuesta[] respuestas) {
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		return "Pregunta [codigoPregunta=" + codigoPregunta + ", pregunta=" + pregunta + ", respuestas="
				+ Arrays.toString(respuestas) + "]";
	}

}
