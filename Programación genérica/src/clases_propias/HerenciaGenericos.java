package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args){
		//instancia de empleado pasando los parametros
		
		/*Empleado Administrativa = new Empleado("Elena", 45, 1500);
		Jefe DirectoraComercial= new Jefe("Ana", 27, 3500);
		
		Empleado nuevoEmpleado=DirectoraComercial;*/
	Pareja<Empleado> Administrativa= new Pareja<Empleado>();
	
	Pareja<Jefe> DirectoraComercial= new Pareja<Jefe>();
	
Pareja.imprimirTrabajador(Administrativa);
Pareja.imprimirTrabajador(DirectoraComercial);

	}
	
	
}
