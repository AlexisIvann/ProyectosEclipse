
public class moto extends vehiculo {

	private boolean reparar_cadena;
	
	public moto (String color, int cv, boolean reparar_cadena){
		super(color,cv,2);
		
		//this.cv =cv;
		//this.color = color;
		this.reparar_cadena = reparar_cadena;
		
	//ruedas = 2;
	//velocidad = 0;
	
	}
	
	//metodos
	public void acelera(){
		velocidad += 20;
		
	//}
	
	//public void frena(){
		//velocidad = 0;
	}
	
	
}
