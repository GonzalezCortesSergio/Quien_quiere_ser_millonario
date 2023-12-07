package model;

import java.util.Arrays;

public class Juego {
	private Jugador jugador;
	private Pregunta [] p;
	
	public Juego(Jugador jugador, Pregunta[] p) {
		
		this.jugador = jugador;
		this.p = p;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Pregunta[] getP() {
		return p;
	}

	public void setP(Pregunta[] p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Juego [jugador=" + jugador + ", p=" + Arrays.toString(p) + "]";
	}	
}
