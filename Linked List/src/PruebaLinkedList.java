import java.util.*;
public class PruebaLinkedList {

	public static void main(String[] args){
		
		LinkedList<String> personas= new LinkedList<String>();//construyendo linked list
		//instancia generica llamada personas
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		
		System.out.println(personas.size()); //permite averiguar cuantos elementos tiene una linkedlist
		
		ListIterator<String> it= personas.listIterator();//creando listiterator
		
		it.next();//juan no sale al final, sale al 2do lugar usando el next. ya que nos manda a la segunda posicion
		it.add("Juan");
		
		
		//Recorrer lista
		
		for(String persona : personas){
			System.out.println(persona);
		//Lista ordenada
		}
	}
}
