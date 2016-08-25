import java.util.LinkedList;
import java.util.ListIterator;


public class PruebaListaEnlazada {
	public static void main(String[] args){
		LinkedList<String> paises=new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		//agregar los elementos de la linked list de capitales,a la lista de linked list paises
		//para que pase de tener 4 elementos a 8, pais capital, pais capital, pais capital.
		
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		while(iterB.hasNext()){//mientras haya un elemento sig dentro de linked list capitales
			if(iterA.hasNext()){//si hay un siguiente elemento en la lista paises
				iterA.next();
			}
			iterA.add(iterB.next());//agrego la capital en la lista paises.
		}
		System.out.println(paises);
		
		
	}

}
