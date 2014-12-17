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
			
			Scanner tecla = new Scanner(System.in);
			
			// Pedir 2 manzanas
			ArrayList <Manzana> manzanas = new ArrayList <Manzana>();
			//crear
			for(int i=0; i<2; i++) {
				System.out.println("Manzana"+(i+1)+":");
				Manzana m1 = new Manzana();
				System.out.println("Tipo de Manzana: ");
				m1.setTipoManzana(tecla.next());
				System.out.println("Procedencia: ");
				m1.setProcedencia(tecla.next());
				System.out.println("Color: ");
				m1.setColor(tecla.next());
				System.out.println("Precio €/kg: ");
				m1.setEurosKilo(tecla.nextDouble());
				System.out.println("Distribuidor: ");
				Distribuidor d1 = new Distribuidor();
				d1.setNombre(tecla.next());
				for(int j=0; j<listaDistribuidores.size(); j++) {
					if((listaDistribuidores.get(j).getNombre()).equalsIgnoreCase(d1.getNombre())) {
						m1.setDistribuidor(listaDistribuidores.get(j));
					}
				}
				manzanas.add(m1);
			}
			// Pedir 2 lechugas
			ArrayList <Lechuga> lechugas = new ArrayList<Lechuga>();
			//crear
			for(int i=0; i<2; i++) {
				System.out.println("Lechuga "+(i+1)+":");
				Lechuga l1 = new Lechuga();
				System.out.println("Tipo de lechuga: ");
				l1.setTipoLechuga(tecla.next());
				System.out.println("Procedencia: ");
				l1.setProcedencia(tecla.next());
				System.out.println("Color: ");
				l1.setColor(tecla.next());
				System.out.println("Precio €/Ud: ");
				l1.setEurosUnidad(tecla.nextDouble());
				System.out.println("Distribuidor: ");
				Distribuidor d1 = new Distribuidor();
				d1.setNombre(tecla.next());
				for(int j=0; j<listaDistribuidores.size(); j++) {
					if((listaDistribuidores.get(j).getNombre()).equalsIgnoreCase(d1.getNombre())) {
						l1.setDistribuidor(listaDistribuidores.get(j));
					}
				}
				lechugas.add(l1);
			}
			// Pedir 2 leches
			ArrayList <Leche> leches = new ArrayList <Leche>();
			//crear
			for(int i=0; i<2; i++) {
				System.out.println("Leche "+(i+1)+":");
				Leche l1 = new Leche();
				System.out.println("Tipo de lechuga: ");
				l1.setTipo(tecla.next());
				System.out.println("Procedencia: ");
				l1.setProcedencia(tecla.next());
				System.out.println("Precio €/l: ");
				l1.setEurosLitro(tecla.nextDouble());
				System.out.println("Distribuidor: ");
				Distribuidor d1 = new Distribuidor();
				d1.setNombre(tecla.next());
				for(int j=0; j<listaDistribuidores.size(); j++) {
					if((listaDistribuidores.get(j).getNombre()).equalsIgnoreCase(d1.getNombre())) {
						l1.setDistribuidor(listaDistribuidores.get(j));
					}
				}
				leches.add(l1);
			}
			// Mostrar manzanas
			System.out.println("Manzana");
			for (int i=0; i<manzanas.size(); i++){
				System.out.println("Tipo: "+manzanas.get(i).getTipoManzana());
				System.out.println("Procedencia: "+manzanas.get(i).getProcedencia());
				System.out.println("Color: "+manzanas.get(i).getColor());
				System.out.println("Precio €/kg: "+manzanas.get(i).getEurosKilo());
				Distribuidor dis1 = manzanas.get(i).getDistribuidor();
				System.out.println("Nombre del distribuidor: "+dis1.getNombre());
				System.out.println("CIF: "+dis1.getCIF());
				System.out.println("Direccion: ");
				System.out.println("\tPueblo: "+(dis1.getDireccion()).getPueblo());
				System.out.println("\tCalle: "+(dis1.getDireccion()).getCalle());
				System.out.println("\tNumero: "+(dis1.getDireccion()).getNumero());
				System.out.println("\tCodigo Postal: "+(dis1.getDireccion()).getCP());
				System.out.println("Contacto: ");
				System.out.println("\tNombre: "+(dis1.getPersonaContacto()).getNombreContacto());
				System.out.println("\tTelefono: "+(dis1.getPersonaContacto()).getTlf());
				System.out.println("\te-mail: "+(dis1.getPersonaContacto()).getEmail());
		
			}
			// Mostrar lechugas
			System.out.println("Lechugas:");
			for (int i=0; i<lechugas.size(); i++){
				System.out.println("Tipo: "+lechugas.get(i).getTipoLechuga());
				System.out.println("Procedencia: "+lechugas.get(i).getProcedencia());
				System.out.println("Color: "+lechugas.get(i).getColor());
				System.out.println("Precio €/Ud: "+lechugas.get(i).getEurosUnidad());
				Distribuidor dis1 = lechugas.get(i).getDistribuidor();
				System.out.println("Nombre del distribuidor: "+dis1.getNombre());
				System.out.println("CIF: "+dis1.getCIF());
				System.out.println("Direccion: ");
				System.out.println("\tPueblo: "+(dis1.getDireccion()).getPueblo());
				System.out.println("\tCalle: "+(dis1.getDireccion()).getCalle());
				System.out.println("\tNumero: "+(dis1.getDireccion()).getNumero());
				System.out.println("\tCodigo Postal: "+(dis1.getDireccion()).getCP());
				System.out.println("Contacto: ");
				System.out.println("\tNombre: "+(dis1.getPersonaContacto()).getNombreContacto());
				System.out.println("\tTelefono: "+(dis1.getPersonaContacto()).getTlf());
				System.out.println("\te-mail: "+(dis1.getPersonaContacto()).getEmail());
		
			}
			// Mostrar lechugas
			System.out.println("Leches:");
			for (int i=0; i<leches.size(); i++){
				System.out.println("Tipo: "+leches.get(i).getTipo());
				System.out.println("Procedencia: "+leches.get(i).getProcedencia());
				System.out.println("Precio €/l: "+leches.get(i).getEurosLitro());
				Distribuidor dis1 = leches.get(i).getDistribuidor();
				System.out.println("Nombre del distribuidor: "+dis1.getNombre());
				System.out.println("CIF: "+dis1.getCIF());
				System.out.println("Direccion: ");
				System.out.println("\tPueblo: "+(dis1.getDireccion()).getPueblo());
				System.out.println("\tCalle: "+(dis1.getDireccion()).getCalle());
				System.out.println("\tNumero: "+(dis1.getDireccion()).getNumero());
				System.out.println("\tCodigo Postal: "+(dis1.getDireccion()).getCP());
				System.out.println("Contacto: ");
				System.out.println("\tNombre: "+(dis1.getPersonaContacto()).getNombreContacto());
				System.out.println("\tTelefono: "+(dis1.getPersonaContacto()).getTlf());
				System.out.println("\te-mail: "+(dis1.getPersonaContacto()).getEmail());
		
			}						

		} catch (Exception e) {
				System.out.println("Error: "+e);
		}
		
	} //fin main

	
}