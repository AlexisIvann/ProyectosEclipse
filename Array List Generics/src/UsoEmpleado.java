import java.util.*;
public class UsoEmpleado {
	
	public static void main(String[] args){
		//Array de 3 elementos, dentro de ese array voy creando objetos de tipo empleado y los almaceno en cada una de las posiciones
		/*Empleado listaEmpleado[] = new Empleado[3];
		
		listaEmpleado[0] = new Empleado("Ana", 45,2500);
		listaEmpleado[1] = new Empleado("Antonio", 32, 3000);
		listaEmpleado[2] = new Empleado("María", 21, 4000);*/
		
		//ArrayList: permite crear listas dinamicas, sin necesidad que le indiquemos cuantos elementos va a almacenar en el interior. mucho mas comodo
		
		ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>(); //almacenar objetos de tipo empleado
		listaEmpleado.add(new Empleado("Ana", 45,2500));
		listaEmpleado.add(new Empleado("Antonio", 32, 3000));
		listaEmpleado.add(new Empleado("María", 21, 4000));
		
		listaEmpleado.add(new Empleado("Jose", 35, 2200));
		
		System.out.println(listaEmpleado.size()); //nos dice cuantos elementos tiene la lista
		
		for(Empleado e: listaEmpleado){//bucle for para imprimir cada uno de los bojetos que tengo almacenados dentro de los array
			
			System.out.println(e.dameDatos());
		}
	}

}
