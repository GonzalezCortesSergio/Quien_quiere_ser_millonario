package controller;

import java.util.Random;

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
		respuestaADescartar = borraUnAleatoria(respuestaCandidatas);
		Comodin_Descarte comodin_Descarte = new Comodin_Descarte(true, respuestaADescartar);

		return comodin_Descarte;
	}

	// Las n respuestas a descartar dentro de las candidatas
	private Respuesta[] borraUnAleatoria(Respuesta[] respuestaCandidatas) {
		
		int desde = 0;
		int hasta = 2;
		int tam = 2;
		int num = 0;
		Respuesta[] respuestaADescartar = new Respuesta[tam];
		// TODO respuesta random a descartar

		Random rnd = new Random (System.nanoTime());
		num = rnd.nextInt(hasta-desde+1)+desde;
		
		if(num == 0) {
			respuestaCandidatas[num].setRespuesta(null); 
		}
		if(num == 1) {
			respuestaCandidatas[num].setRespuesta(null); 		
		}
		if(num == 2) {
			respuestaCandidatas[num].setRespuesta(null); 			
		}
		
		respuestaADescartar = respuestaCandidatas;
		
		return respuestaADescartar;
	}
}
