package pasapalabra;

import java.util.Scanner;

public class EntradaSalida {

	public static String hacerPregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(pregunta.getPosicion()+" la "+pregunta.getLetra()+": "+pregunta.getDefinicion());
		return sc.nextLine();
	}

	public static void darEnhorabuena(int puntuacion) {
		System.out.println("Muy bien, llevas "+puntuacion+" puntos");
		
	}

	public static void mostrarCorrecta(String solucion) {
		System.out.println("Incorrecto. La respuesta era: "+solucion);
		
	}

}
