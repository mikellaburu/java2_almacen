import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class ProgramaAlmacen {

	public static void main(String[] args){
		System.out.println("------------ALMACEN------------");
		System.out.println("Leer fichero 'distribuidores.txt' y guardar en un ArrayList");

		try {
			// crear fichero
			File archivo = new File("/home/zubiri/ProyectosJava/java2_almacen/src","distribuidores.txt");

			if (archivo.createNewFile()) {
				System.out.println("Se ha creado el archivo 'distribuidores.txt' correctamente");
			} else {
				System.out.println("Ya existe el archivo 'distribuidores.txt'");
			}
			
			// Leer fichero y mostrar	
			System.out.println("Leer el contenido del fichero, identificar los objetos y atributos, y mostrarlos por pantalla\n");
	
			Scanner leerFichero = new Scanner (archivo);

			int cont = 1;
			while (leerFichero.hasNextLine()) {
				String fila = leerFichero.nextLine();//lerro bat irakurri fitxategitik eta string moduan gorde
				String [] atributos = fila.split("; ");//atributuak koma eta hutsuneaz bereiztu eta string motako array batean gorde 
				
				System.out.println("Distribuidor "+cont);
				System.out.println();
				System.out.println("\tNombre: "+atributos[0]);
				System.out.println();
				System.out.println("\tCIF: "+atributos[1]);
				System.out.println();

				String [] atribDireccion = atributos[2].split("\\*");
				System.out.println("\tDireccion:");

				System.out.println("\t\tPueblo: "+atribDireccion[0]);
				System.out.println();
				System.out.println("\t\tCalle: "+atribDireccion[1]);
				System.out.println();
				System.out.println("\t\tNumero: "+atribDireccion[2]);
				System.out.println();
				System.out.println("\t\tCodigo Postal: "+atribDireccion[3]);
				System.out.println();

				String [] atribContacto = atributos[3].split("\\*");
				System.out.println("\tContacto:");
				System.out.println("\t\tNombre: "+atribContacto[0]);
				System.out.println();
				System.out.println("\t\tTelefono: "+atribContacto[1]);
				System.out.println();
				System.out.println("\t\tE-mail: "+atribContacto[2]);
				System.out.println();


				/*for (int i=0; i<atribDireccion.length; i++) {
					
					String [] atribIng = ingSeparados[i].split("\\*");
					
					if (Boolean.parseBoolean(atribIng[3])) {
						System.out.println("\t\t"+atribIng[0]+", "+atribIng[1]+" gramo(s)");
					}else{
						System.out.println("\t\t"+atribIng[0]+", "+atribIng[2]+" unida(es)");
					}
				}
				System.out.println();
				System.out.println("\tPreparacion: "+atributos[2]);
				System.out.println();*/
				cont++;
			}
			leerFichero.close();
		} catch (Exception e) {
				System.out.println("Error: "+e);
		}

	} //fin main

	
}