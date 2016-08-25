import java.util.LinkedList;


public class PruebaListaEnlazada {
 
	public static void main(String[] args){
		
		LinkedList<String> paises=new LinkedList<String>();//Lista con los paises
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
	}
}
