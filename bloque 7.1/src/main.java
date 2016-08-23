// poliformismo es la capacidad que tiene java de elegir uno u otro metodo en funcion del contexto.
//Sobrecarga 
// redefinicion
public class main {

	public static void main(String[] args){
		numero num = new numero(); // primero: instanciar un objeto de la clase numero
		                           //parentesis vacios por el constructor. en este caso constructor por defecto, no inicializa ningun parametro.
		
	num.set(10,0.5); //llamo al metodo set. y pongo un entero 10
	             //ejecutamos solamente el metodo num1 porque ingresamos un entero, no un double!
	System.out.println("El valor de los atributos: num1 = "+num.getNum1()+" num2 = "+num.getNum2());
	
	
	
	//si la llamada tiene dos parametros, entonces se ejecuta el metodo con dos parametros
	//no se ejecuta los otros dos metodos porque solamente tienen un parametro.
	}
}
