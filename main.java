// ESCANEO PARA INTRODUCIR DATOS POR TECLADO
import java.util.Scanner;
public class main {
    public static void java(String[]args) {
		Scanner teclado = new Scanner (System.in);
		String continuar;
		do {
			System.out.println("Biblioteca de Muzkiz");
		    // CUANDO PULSAS ENTER SE GENERA UN SALTO DE LÍNEA Y PARA QUE NO SE GUARDE PONES ESTA LINEA PARA QUE LIMPIE
		    // LO HE BUSCADO EN INTERNET -> .nextInt y .nextLine
            // DATOS DEL AUTOR
			System.out.println("ID Autor: ");
		    int codigoAutor = teclado.nextInt();
			teclado.nextLine(); 
				
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
				
			System.out.println("Apellido 1: ");
			String apellido1 = teclado.nextLine();
		        
			System.out.println("Apellido 2: ");
			String apellido2 = teclado.nextLine();
			
		    System.out.print("Año de nacimiento: ");
		    int nacimiento = teclado.nextInt();
		    teclado.nextLine();

            
            Autor autor =  new Autor (codigoAutor, nombre, apellido1, apellido2,"", nacimiento);
            // DATOS DEL LIBRO
		        System.out.println("ID Autor: ");
				int codigoLibro = teclado.nextInt();
				teclado.nextLine();
				
		        System.out.println("Título del libro: ");
		        String titulo = teclado.nextLine();
		        
		        System.out.println("ISBN: ");
		        String isbn = teclado.nextLine();
		        
		        System.out.println("STOCK: ");
		        int numeroCopias = teclado.nextInt();
		        teclado.nextLine();
		        
		        Libros libro = new Libros(codigoLibro, titulo, isbn, numeroCopias, autor);
		        
		        //GUARDAR
		        System.out.println("\nGuardando: "+ libro.getTitulo() +"de "+ libro.getAutora().getnombre());
		        
		        //SEGUIR CONTINUANDO
		        System.out.println("\n¿Quieres seguir registrando libros? (si/no):");
		        continuar = teclado.nextLine();
		} while (continuar.equalsIgnoreCase("si"));
		System.out.println("\nPrograma Finalizado.");
		teclado.close();
	}
}
