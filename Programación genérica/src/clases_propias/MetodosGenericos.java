package clases_propias;
import java.util.*;
public class MetodosGenericos {
public static void main(String[] args){
	
	String nombres[]={"Jose", "Maria", "Pepe"}; //Array creado
	
	System.out.println(MisMatrices.getMenor(nombres));
	
	//String elementos=MisMatrices.getElementos(nombres);
	
	//System.out.println(elementos);
	
	//Array empleados
	/*Empleado listaEmpleados[]={new Empleado("Ana", 45, 2500),
			new Empleado("Ana", 45, 2500),
			new Empleado("Ana", 45, 2500),
			new Empleado("Ana", 45, 2500),
			new Empleado("Ana", 45, 2500),
	
	};
	System.out.println(MisMatrices.getElementos(listaEmpleados));*/
}
	
}

class MisMatrices{
	
	//public static <T> String getElementos(T[] a){//metodo generico el nombre, y el argumento que va a recibir(array)
		
		//return "El array tiene " + a.length + " elementos";
	//}
	
	public static <T extends Comparable> T getMenor(T[]a){
		
		if(a==null || a.length==0){// si el array es igual a null o la longitud del array es igual a 0
			return null; //devolverme un null
		}
		
		T elementoMenor= a[0]; //examinando el elemento a[0] con a[1]
		
		for(int i=1 ;i<a.length;i++ ){
			if(elementoMenor.compareTo(a[i])>0){
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
	}
	
	
}