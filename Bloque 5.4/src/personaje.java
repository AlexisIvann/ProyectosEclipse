import java.util.Random;


public class personaje {

	private int salud, fisico, fuerza, ph, nivel;
	private String nombre;
	private Random rand = new Random(System.nanoTime()); //numeros aleatorios
	
	//sets and gets
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
		
	
	//Ataques fisicos 

public int ataque_fisico(){
	int aleatorio = rand.nextInt(2);
	return nivel * fisico * aleatorio;
}
	
public int ataque_fuerza(){
	if(ph > 0){
		ph--;
		return nivel * fuerza;
		
	}
	else{
		return 0;
		
	}
}

public void daño(int salud){
	this.salud -= salud; 
}

}



	

