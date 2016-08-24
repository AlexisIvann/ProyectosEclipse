 //Clase arrayList(lista de elementos que puedo manipular)
//metodos: add(agregar elementos a la lista)
//get(obtener un elemento en la lista
//set(asignar elementos a la lista
//remove eliminar elemento de la lista
//size sirve para obtener el tamaño de mi arraylist
import java.util.ArrayList;
import java.util.List;



public class Listas {

	public static void main(String[] args){
		
		List<Integer> Numeros; //lista de tipo enteros!
		Numeros=new ArrayList<>();
		Numeros.add(1);
		Numeros.add(15);
		Numeros.add(21);
		
		Numeros.remove(1); //eliminando la posicion 1, osea el 15.
		System.out.println(Numeros.get(0));
		System.out.println(Numeros.get(1));//ahora el 21 está en la posición 1
	
		System.out.println(Numeros.size()); //muestra el tamaño de la lista, osea, 2 porque borre el 15.
	System.out.println(Numeros.contains(1)); //la lista tiene el numero 1
	}
	
}
