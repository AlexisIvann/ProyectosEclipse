package clases_propias;

public class Empleado {
// campo de clases encapsulados
private String nombre; //
private int edad;
private double salario;

	//Constructor que recibe por parámetros nombre, edad y salario de un empleado
//Almacenar en los campos encapsulados los valores que le pasemos a nombre edad y salario
	public Empleado(String nombre, int edad, double salario){
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	//getter que nos proporciona la info de un empleado en concreto
	public String dameDatos(){
		
		return "El empleado se llama "+ nombre +" Tiene " + edad + " y un salario de: " + salario;
	}
	
}
