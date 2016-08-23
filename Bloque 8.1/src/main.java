
public class main {

	public static void main(String[] args){
		coche c = new coche ("rojo",100, 4); //crea una instancia de coche, potencia de 100 y 4 puertas.
		moto m = new moto("verde", 200, false);
		System.out.println("La velocidad del coche es de : "+c.getVelocidad()); // valores del objeto y los atributos son independientes entre si
		System.out.println("La velocidad de la moto es de : "+m.getVelocidad()); //
		c.acelera();
		m.acelera();
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad de la moto es de: "+m.getVelocidad());
		
		
	}
}
