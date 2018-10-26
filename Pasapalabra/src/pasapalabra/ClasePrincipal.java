package pasapalabra;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		//String nombre=EntradaSalida.pedirNombre();
		ArrayList<Pregunta> lista_preguntas=AccesoFichero.parsearXML();
		int puntuacion=0;
		for (Pregunta pregunta : lista_preguntas) {
			String respuesta_usuario=EntradaSalida.hacerPregunta(pregunta);
			if (respuesta_usuario.equalsIgnoreCase(pregunta.getSolucion()))
			{	
				puntuacion++;
				EntradaSalida.darEnhorabuena(puntuacion);
			}
			else
			{
				EntradaSalida.mostrarCorrecta(pregunta.getSolucion());
			}
		}
		//Grabar ranking

	}

}
