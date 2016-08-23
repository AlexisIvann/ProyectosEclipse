//MoSTRAR TODOS LOS NUMEROS QUE HAY ENTRE DOS NUMEROS INTRODUCIDOS POR TECLADO
import java.util.Scanner;

public class bloque32 {
public static void main(String[] arg){
	int a,b,i;
	Scanner S = new Scanner(System.in);
	
	System.out.print("Introduce el número menor: ");
	a = S.nextInt();
	
	System.out.print("Introduce el número mayor: ");
	b = S.nextInt();
	
	i =a;
	while(i < b){
		System.out.print(i+" ");
		i++;
		
	}
}
}
