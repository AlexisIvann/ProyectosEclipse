import java.util.Scanner;
public class main {

	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		String nombre;
		int opcion;
		
		System.out.println("Cual es tu nombre?");
		nombre = S.nextLine();
		
		entrenador yo = new entrenador(nombre);
	batalla bat = new batalla (yo);
	
	do{
		yo.mostrar_mochila();
		System.out.println();
		System.out.println();
		
		System.out.println("Elige una opción: ");
		System.out.println("1: Empezar la batalla");
		System.out.println("2: Salir");
		
		opcion = S.nextInt();
		
		if(opcion == 1){
			bat.comienza();
			
		}
	}while(opcion!= 2);
		
	}
	
	
}
