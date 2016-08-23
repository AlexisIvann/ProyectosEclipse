import java.util.Scanner; 

public class bloque15 {
public static void main(String[] arg){
	int a,b,aux;
	Scanner S = new Scanner(System.in);
	
	
	
	System.out.println("Introduce el valor para el atributo A: ");
	a = S.nextInt();
	
	System.out.println("Introduce el valor para el atributo B: ");
	b = S.nextInt();
	
	aux = a;
	a = b;
	b = aux;
	
	System.out.println("Los valores actuales de a y b son: "+a+","+b);
	
}
}
