package principal;

import model.Juego;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// Victor: Ha hecho el paquete model y tambien del paquete controller ha hecho
		// la clase Comodin_Descartes,
		// ha empezado con la estructura de la clase principal

		// Nota: He creado un model juego que sera donde se hara el juego en si llamando
		// a las demas clases
		int opcion, uno = 1, tam;
		String nombre;
		Juego juego;

		do {
			System.out.println("""
					1-Entrar al juego
					0-Salir
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				// jugador
				// llamar preguntas
				break;
			case 0:
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Intenta otra vez");
				break;
			}
		} while (opcion != 0);
	}
}
