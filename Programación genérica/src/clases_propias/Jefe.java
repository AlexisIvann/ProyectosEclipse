package clases_propias;

public class Jefe extends Empleado{ //hereda de empleado
	public Jefe(String nombre, int edad, double salario){ //constructor 
		
		super(nombre,edad,salario);//llamamos al constructor de empleado pasandole a ese constructor,
		//los argumentos del constructor de jefe
	}
	//metodo propio, que aplica un incentivo a los objetos de tipo jefe
	double incentivo(double inc){
		
		return inc;
	}

}
