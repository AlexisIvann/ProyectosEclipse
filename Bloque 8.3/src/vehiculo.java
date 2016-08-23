// clase padre. todas las clases heredan todos los atributos, y metodos, los tienen los demas. pero son independientes los atributos que las clases hijos tienen del padre.
public class vehiculo {

	private String color;
	private int cv, ruedas;
	protected int velocidad;

	//Constructor
	public vehiculo(String color,int cv,int ruedas){ //inicializa estos atributos
		this.color = color;
		this.cv = cv;
		this.ruedas = ruedas;
	velocidad = 0;	
	}

	public int getCv() {
		return cv;
	}


	public int getRuedas() {
		return ruedas;
	}


	public int getVelocidad() {
		return velocidad;
	}

	
	//metodos
	
		public void acelera(){ 
			velocidad += cv/20; //este metodo incrementa en 10 la velocidad
			
			}
		
		public void frena(){
			velocidad = 0; //este metodo pone la velocidad a 0
			
		}
	


}
