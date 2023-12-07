package controller;

import model.Comodin_Descarte;
import model.Pregunta;
import model.Respuesta;

public class Controller_Comodin_Descartes {

	public Comodin_Descarte utilizarComodin(Pregunta pregunta) {
		// metodo que descarta 2 respuestas de la pregunta que entra.
		int tam = 3;
		int posicion = 0;
		Respuesta[] respuestaCandidatas = new Respuesta[tam];
		Respuesta[] respuestaADescartar = new Respuesta[tam - 1];

		// busca las respuestas incorrectas(candiadatas a descartar)
		for (int i = 0; i < pregunta.getRespuestas().length; i++) {
			if (!pregunta.getRespuestas()[i].isCorrecto()) {
				respuestaCandidatas[posicion] = pregunta.getRespuestas()[i];
				posicion++;
			}
		}
		// Llama al metodo de respuestas descartadas
		respuestaADescartar = borraUnaAleatoria(respuestaCandidatas);
		Comodin_Descarte comodin_Descarte = new Comodin_Descarte(true, respuestaADescartar);

		return comodin_Descarte;
	}

	// Las n respuestas a descartar dentro de las candidatas
	private Respuesta[] borraUnaAleatoria(Respuesta[] respuestaCandidatas) {
		int desde = 1;
		int hasta = 3;
		int tam = 2;
		Respuesta[] respuestaADescartar = new Respuesta[tam];
		// TODO respuesta random a descartar

		// Random rnd = new Random(System.nanoTime(hasta-desde)+desde);

		return respuestaADescartar;
	}
}
