// <  >

import java.util.Scanner;
public class bloque33 {
public static void main(String[] args){
	int a;
	Scanner S = new Scanner(System.in);
	do{
		System.out.println("1. Ense�ar por pantalla Hola Mundo.");
		System.out.println("2. Ense�aremos por pantalla los n�meros entre 5 y 10.");
		System.out.println("3. Ense�ar por pantalla Suscribite a empeza a programar.");
		System.out.print("Introduce una opci�n: ");
		a=S.nextInt();
		
	}while(a > 3 || a < 1);
	
	switch(a){
	case 1:
		System.out.println("Hola mundo.");
		break;
	case 2:
		for(int i = 5; i < 10; i++){
			System.out.print(i+" ");
			
		}
		break;
	case 3:
		System.out.println("Suscribite a empeza a programar.");
		break;
	}
}
}
