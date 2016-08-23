import java.util.Random;


public class main {
  
	public static void main(String[] args){
		int aux1, aux2; //almacenar dos numeros aleatorios para crear un objeto de tipo vertice
		
		Random rand = new Random(System.nanoTime());
	aux1 = rand.nextInt(10);// incializando dos variables de tipo entero con variables aleatorias
	aux2 = rand.nextInt(10);

	vertice a = new vertice(5,25);
	
	aux1 = rand.nextInt(10);// incializando dos variables de tipo entero
	aux2 = rand.nextInt(10);

	vertice b = new vertice(aux1,aux2);
	
	aux1 = rand.nextInt(10);// incializando dos variables de tipo entero
	aux2 = rand.nextInt(10);

	vertice c = new vertice(aux1,aux2);


	polinomio t1 = new polinomio(a,b,c); //objeto de tipo triangulo, pasando tres objetos de tipo vertice.
	
	
	vertice temp = t1.getA(); //devuelve el objeto "a" creado en la clase triangulo 
	
	System.out.println("El valor de x del objeto temp es: "+temp.getX()+" e y es: "+temp.getY());
	
	temp.setX(20); //modificando valores del objeto a(5,25) a (20,32)
	temp.setY(32);
	
	System.out.println("El valor de x del objeto temp es: "+a.getX()+" e y es: "+a.getY());
	}
}
