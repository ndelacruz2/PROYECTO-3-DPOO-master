package interfaces;

import java.util.Scanner;

import entities.Galeria;
import logic.Comprador;
import logic.Operador;

public class operador_main {
	
	public static void consola(String usuario, String contrasena) {
		
	    Scanner escaner = new Scanner(System.in);
	    
	    Operador operador = Galeria.buscaroperador(usuario);
	    String nombre = operador.getnombre();
	    nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
		
			while (true) {
				
				System.out.println("Bienvenido, Operador");
				System.out.println("Opciones posibles: ");
				System.out.println("1. Ver piezas.");
				System.out.println("2. Ver artistas.");
				System.out.println("3. Ver compradores.");
				System.out.println("4. Buscar pieza.");
				System.out.println("5. Buscar artista.");
				System.out.println("6. Buscar comprador.");;
				System.out.println("7. Ver subastas [extendido].");
				System.out.println("8. Salir..");
				int opcion = escaner.nextInt();
				
				switch (opcion) {
				
				
	            case 1:
					
					
					
					break;
					
				case 2:
					
					
					
					break;
				case 3:
					
					
				break;
				
				
				
				case 4:
					
					
					break;
					
				case 5:
					
					
					break;
				case 6:
					
					
					
					break;
				case 7:
					
					
					
					break;
						
								
				case 8:
					
					System.out.println("¡Muchas gracias por su visita!");
					escaner.close();
					System.exit(0);
					break;
					
					
					
				}
			}
			
		
		
	}

}
