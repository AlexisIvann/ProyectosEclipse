import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

//Clase iterator: Alternativa para recorrer una lista
public class iterador {
public static void main(String[] args){
	
	List<String> lenguajes; //nUEVA LISTA
	lenguajes = new ArrayList<>();
	
	lenguajes.add("Java");
	lenguajes.add("PHP");
	lenguajes.add("VB.NET");
	lenguajes.add("JavaScript");
	lenguajes.add("C++");
	
	Iterator<String> it=lenguajes.iterator();
	while(it.hasNext()){//mientras que it tenga un valor siguiente
	System.out.println(it.next()); //vamos a imprimir ese valor para poder recorrer todos los elementos de la lista
	}
	
}
}
