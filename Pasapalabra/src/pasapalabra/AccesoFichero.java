package pasapalabra;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoFichero {

	public static ArrayList<Pregunta> parsearXML() {
		// TODO Auto-generated method stub
		ArrayList<Pregunta> lista_preguntas=new ArrayList();
		SAXBuilder builder = new SAXBuilder();
		Document documento;
		try {
			documento = builder.build(new File("D:\\LUIS_SANZ\\XML_PASAPALABRA\\PREGUNTAS.xml"));
			Element elemento_raiz=documento.getRootElement();
			Element elemento_jugador=elemento_raiz.getChild("jugador");
			List<Element> lista_elementos_pregunta=elemento_jugador.getChildren("pregunta");
			for (Element elemento_pregunta : lista_elementos_pregunta) {
				String letra=elemento_pregunta.getChild("letra").getValue();
				String posicion=elemento_pregunta.getChild("posicion").getValue();
				String definicion=elemento_pregunta.getChild("definicion").getValue();
				String solucion=elemento_pregunta.getChild("solucion").getValue();
				Pregunta p=new Pregunta(letra, posicion, definicion, solucion);
				lista_preguntas.add(p);
			}
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista_preguntas;
	}

}
