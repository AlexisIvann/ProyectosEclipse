
public class coche extends vehiculo  { // heredando de la clase vehiculo, todas las cosas qeu tenga vehiculo, ahora la tiene coche

	private int puertas;
	
	//private int cv, ruedas;
	//private int velocidad;
	//private String color;
	
	//Constructor
	public coche (String color, int cv, int puertas){ //pasamos numero de caballos y numero de puertas
		
		super(color,cv,4); //llama al constructor de la clase vehiculo con super
		
		this.puertas = puertas; //atributos
		//this.cv = cv;
		//this.color = color;
		
		//ruedas = 4; //ponemos directamente que tiene 4 ruedas
		//velocidad = 0;
		
		
		
		
	}
	
	//gets

	//public int getPuertas() {
		//return puertas;
	//}

	//public int getCv() {
		//return cv;
	//}


	//public int getRuedas() {
		//return ruedas;
	//}


	//public int getVelocidad() {
		//return velocidad;
	//}

	//metodos
	
	//public void acelera(){ 
		//velocidad +=10; //este metodo incrementa en 10 la velocidad
		
		//}
	
	//public void frena(){
		//velocidad = 0; //este metodo pone la velocidad a 0
		
	//}
	
}
