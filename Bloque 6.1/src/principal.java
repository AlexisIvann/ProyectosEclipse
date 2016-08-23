//Constructores, mucho más sencillo.
public class principal {

	public static void main(String[] args){
		
		coche toyota = new coche(0, 0, "Prius");
		
		//toyota.setAceleracion(0); //rellenar datos de objetos
		//toyota.setVelocidad(0);
		//toyota.setNombre("Prius");
		
		System.out.println("El nombre de mi coche es: "+toyota.getNombre()+" y tiene una velocidad de: "+toyota.getVelocidad());
		
	}
}
