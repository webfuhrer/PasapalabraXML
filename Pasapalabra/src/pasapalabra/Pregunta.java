package pasapalabra;

public class Pregunta {
private String letra, posicion, definicion, solucion;

public String getLetra() {
	return letra;
}

public String getPosicion() {
	return posicion;
}

public String getDefinicion() {
	return definicion;
}

public String getSolucion() {
	return solucion;
}

public Pregunta(String letra, String posicion, String definicion, String solucion) {
	super();
	this.letra = letra;
	this.posicion = posicion;
	this.definicion = definicion;
	this.solucion = solucion;
}

}
