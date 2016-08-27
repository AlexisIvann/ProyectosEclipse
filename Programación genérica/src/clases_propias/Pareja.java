package clases_propias;

public class Pareja <T>{//manejando argumento genérico se usan las letras t u y k{
//Campo genérico
	private T primero;
	
	//Constructor
	public Pareja(){
		primero=null;
		
	}
	//setter para que sea capaz de cambiar el valor de ese campo principal null
	public void setPrimero(T nuevoValor){//recibe un objeto generico
		
		primero=nuevoValor;
	}
	//getter para saber que me devuelve(objeto generico)
	
	public T getPrimero(){
		return primero;
	}
//metodo que va a recibir un argumento llamado p. Ese argumento es un generico de tipo empleado
	public static void imprimirTrabajador(Pareja<? extends Empleado> p){ 
		//le estamos diciendo a este metodo que puede recibir un tipo empleado
		//o cualquier subclase perteneciente a empleado.(jefe, empleado)
	
		Empleado primero=p.getPrimero();
		System.out.println(primero);
	}
}
