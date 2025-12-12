/**
 * 
 */
package exercises;

import java.io.*;

public class Mensajes {

	
	public static void main(String[] args) {
		File poem = new File ("los_zapaticos_de_rosa.txt");

		FileReader reader = null;
		BufferedReader buffer = null;
		
		//int saltosLinea=0;
		
		// IMPRESION DE PRUEBA DEL CONTENIDO DEL ARCHIVO
		try {
			reader = new FileReader(poem);
			buffer = new BufferedReader(reader);
			
			String linea;
			while( (linea=buffer.readLine()) != null) {
				
				System.out.println(linea);
				}
			}
		catch(Exception err){
			err.printStackTrace();
			}
		
		
		
	}

}
