
public class Empleado {
private String nombre;
private int edad;
private double salario;

//Constructor

public Empleado(String nombre, int edad, double salario){
	
	this.nombre=nombre;
	this.edad=edad;
	this.salario=salario;
	
}

public String dameDatos(){//metodo
	
	return "El empleado se llama " +nombre+ " Tiene "+edad+ " a�os "+ " y un salario de:" +salario;
	
}

}
