package clases_propias;

public class UsoPareja {

	public static void main(String [] args){
		
		//instanciar clase generica
		
		Pareja<String> uno = new Pareja<String>(); //objeto de clase string
		
		uno.setPrimero("Juan"); //primero=juan con setPrimero
		
		System.out.println(uno.getPrimero());
		
		Persona pers1=new Persona("Ana");
		
		Pareja<Persona> dos= new Pareja<Persona>(); //2da instancia de la clase pareja objeto de tipo persona
		
		dos.setPrimero(pers1);
		
		System.out.println(dos.getPrimero());
		
	}
}

class Persona{
	
	private String nombre;//campo encapsulado de tipo string llamado nombre
	
	//Constructor
	public Persona(String nombre){
		
		this.nombre=nombre; //dando al campo de clase nombre el valor que le pasemos al constructor
	}
	public String toString(){
		return nombre;
	}
}