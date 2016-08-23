//Polimorfismo : Multiples comportamientos. conseguimos llamando a algo por el mismo nombre, pero java decide a quien llamar
public class main {

	public static void main(String[] args){
		vehiculo c	=		new		coche("rojo",100, 4); // polimorfismo, tenemos objetos de tipo diferentes pero puedo meter dentro de una referncia de tipo vehiculo un ovjeto de tipo coche, poruqe coche hereda de veehiculo
		moto m = new moto("verde", 200, false);
		System.out.println("La velocidad del coche es de : "+c.getVelocidad()); // 
		System.out.println("La velocidad de la moto es de : "+m.getVelocidad()); //
		c.acelera();
		m.acelera();
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad de la moto es de: "+m.getVelocidad());
		
		
	}
}
