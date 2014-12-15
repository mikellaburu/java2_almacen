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
			ArrayList <Distribuidor> listaDistribuidores = new ArrayList <Distribuidor>();

			int cont = 1;
			while (leerFichero.hasNextLine()) {
				String fila = leerFichero.nextLine();//lerro bat irakurri fitxategitik eta string moduan gorde
				String [] atributos = fila.split("; ");//atributuak koma eta hutsuneaz bereiztu eta string motako array batean gorde 
				Distribuidor dist = new Distribuidor ();
				dist.setNombre(atributos[0]);
				dist.setCIF(atributos[1]);
				
				Direccion dir = new Direccion();
				String [] atribDireccion = atributos[2].split("\\*");
				dir.setPueblo(atribDireccion[0]);
				dir.setCalle(atribDireccion[1]);
				dir.setNumero(Integer.parseInt(atribDireccion[2]));
				dir.setCP(atribDireccion[3]);
				dist.setDireccion(dir);

				Contacto contacto = new Contacto();
				String [] atribContacto = atributos[3].split("\\*");
				contacto.setNombreContacto(atribContacto[0]);
				contacto.setTlf(atribContacto[1]);
				contacto.setEmail(atribContacto[2]);
				dist.setPersonaContacto(contacto);

				listaDistribuidores.add(dist);
				/*
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
				

				
				cont++;*/
			}
			leerFichero.close();
			for (int i=0; i<listaDistribuidores.size(); i++) {
				
				System.out.println("Distribuidor "+(i+1)+":");
				System.out.println("\tNombre: "+listaDistribuidores.get(i).getNombre());
				System.out.println("\tCIF: "+listaDistribuidores.get(i).getCIF());
				System.out.println("\tDireccion:");
				Direccion dir1 = new Direccion();
				dir1 = listaDistribuidores.get(i).getDireccion();
				System.out.println("\t\tPueblo: " + dir1.getPueblo());
				System.out.println("\t\tCalle: " + dir1.getCalle());
				System.out.println("\t\tNumero: " + dir1.getNumero());
				System.out.println("\t\tCodigo Postal: " + dir1.getCP());
				System.out.println("\tContacto:");
				Contacto contac1 = new Contacto();
				contac1 = listaDistribuidores.get(i).getPersonaContacto();
				System.out.println("\t\tNombre: " + contac1.getNombreContacto());
				System.out.println("\t\tTelefono: " + contac1.getTlf());
				System.out.println("\t\te-mail: " + contac1.getEmail());
				
			}

		} catch (Exception e) {
				System.out.println("Error: "+e);
		}
		
	} //fin main

	
}