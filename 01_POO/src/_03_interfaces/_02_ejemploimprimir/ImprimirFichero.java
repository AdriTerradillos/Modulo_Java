package _03_interfaces._02_ejemploimprimir;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible{

	@Override
	public void imprimir(String cadena){
		//Este método arroja Excepciones que DEBEMOS controlar
		//Con esta clase vamos a poder escribir en un fichero
		//de texto cadenas
		try {
			PrintWriter pw = new PrintWriter("fichero.txt"); // --> Usando Eclipse este fichero
															 // de texto va a la carpeta src del
															 // del proyecto.
			//El objeto tiene un método que nos permite escribir
			//en el fichero, que se llama igual que el método
			//de la clase "System.out"
			pw.println(cadena);//LLenamos el buffer con la información
			pw.flush();//Pasamos la información del buffer al fichero
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

