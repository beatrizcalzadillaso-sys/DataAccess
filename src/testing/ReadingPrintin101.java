/**
 * 
 */
package testing;

import java.io.*;

public class ReadingPrintin101 {

	
	public static void main(String[] args) {
		File f_verso = new File ("archivo.cfg");

		//FileReader reader = new FileReader(f_verso);
		
		FileReader reader = null;
		BufferedReader buffer = null;
		
		if (f_verso.exists()) {
			System.out.println("Nombre del archivo: "+ f_verso.getName());
			System.out.println("\nRuta: " + f_verso.getPath());
			System.out.println("\nRuta absoluta: " + f_verso.getAbsolutePath());
			System.out.println("\nSe puede leer? "+f_verso.canRead());
			System.out.println("\nSe puede escribir? "+f_verso.canWrite());
			System.out.println("\nTamaño: "+f_verso.length());
			}

		System.out.println("-----------------------");
		try {
			reader = new FileReader (f_verso);
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