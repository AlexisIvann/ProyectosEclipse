//Calcular la media de los elementos de un vector.

import java.util.Scanner;

public class bloque42 {

	public static void main(String[] args) {
		int num;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del vector");
		num = S.nextInt(); // metido por teclado la longitud
		
		double[] vec = new double[num]; //declaramos vector
		double total = 0; // almacena la media  
		
		for(int i = 0; i < num; i++){ //bucle para meter elementos al vector por teclado
			System.out.print("Introduce valores al vector: ");
			vec[i] = S.nextDouble();
			
		}
		for(int i = 0; i <  num; i++){ //sumar cada uno de los elementos que tiene el vector en total
			total +=vec[i];
		}
total /= num; // total = total / num

System.out.println("La media es: "+total);
	}

}
