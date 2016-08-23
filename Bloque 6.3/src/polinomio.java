import java.util.Random;


public class polinomio {
private vertice[] v ; // creando referncia. en el futuro vamos a tener un vector de tipo vertice que se va a llamar v
//vector que se modifica el tamaño en el futuro.
	
public polinomio(int tam){ //constructor
	int aux1, aux2; //crear dos enteros para almacenar los numeros aleatorios
	Random rand = new Random(System.nanoTime());
	
	v = new vertice[tam];//vector que le ponemos el tamaño que nosotros querramos
	for(int i = 0; i < tam; i++){
		
		aux1 = rand.nextInt(10);
		aux2 = rand.nextInt(10);
		v[i] = new vertice(aux1, aux2);//creo u nvector de objetos, tengo referencias a donde se encuentran los objetos
		
		
	}
	
}
public void muestra(int i ){ //mostrar por pantalla que realmente se creo una posicion del vector
vertice aux = v[i];

System.out.println("El valor de la posición i: "+i+" Es x: "+aux.getX()+" Y: "+aux.getY());

}
}
