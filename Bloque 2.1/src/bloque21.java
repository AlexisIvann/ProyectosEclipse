import java.util.Scanner;
public class bloque21 {
public static void main(String[] arg){
	//comprobar si un mumero dado por teclado es par.
	//Un numero es par si cuando se divide entre 2 su resto da 0
	int x,y;
	Scanner S = new Scanner(System.in);
	System.out.println("Introduce un n�mero por teclado: ");
	
	x = S.nextInt();
	
	y = x % 2;
	
	if(y==0){
		System.out.println("El n�mero "+x+" es par.");
	}
	else{
		System.out.println("El n�mero "+x+" es impar.");
	}
}
}
