import java.util.Random;

public class pikachu {
private int ataque, defensa, nivel, vida; //Estadisticas
private int pm1,pm2; //Veces que se puedan realizar los ataques

private Random rand = new Random(System.nanoTime()); //objeto tipo random para generar numeros aleatoriorios

//Constructor

public pikachu(){
	nivel = rand.nextInt(5) + 1; //Le sumo 1 al nivel para tener como minimo el nivel 1. entre 1 y 5.

ataque = 10 * nivel;
defensa = 5 * nivel;
vida = 10*nivel;

pm1 = 10;
pm2=10;

}

//Getters solamente, porque no se pueden modificar los atributos ataq,def,niv,vida,pm1,pm2.


public int getAtaque() {
	return ataque;
}

public int getDefensa() {
	return defensa;
}

public int getNivel() {
	return nivel;
}

public int getVida() {
	return vida;
}

public int getPm1() {
	return pm1;
}

public int getPm2() {
	return pm2;
}

public Random getRand() {
	return rand;
}

//Ataques : deben de tener el PM de cada ataque que sea mayor que 0, sino no se realiza
// el ataque.
//Picaje es un ataque basico y quita de daño lo mismo que tenga de ataque pikachu

public int placaje(){
	int daño;
	
	if(pm1  > 0){ //si tenemos pm atacamos.
		daño = ataque; 
		pm1--; // cuando realizamos ataque, restamos 1 los pm.
	
	}
	else{
		daño = 0;
		
	}
	return daño;
	
}
//Rayo es un ataque un poco mas fuerte y quita el doble de daño que el atributo ataque.

public int rayo(){
	int daño;
	if(pm2  > 0){
		daño = ataque * 2; 
		pm2--;
		
	}
	else{
		daño = 0;
		
	}
	return daño;
	
}
//Ataque recibido:
//Cuando un pikachu recibe daño se llama a este metodo, que lo que hace es restarle vida
//al pobre pikachu en funcion del daño recibido

public int daño_recibido(int daño){ 
	if((daño = defensa)  > 0){ //al daño le resto la defensa que tiene el pokemon, 
		vida -= (daño - defensa);//si es mayor que 0, le resto a la vida
		
	}
	return vida;
}

//Datos
//simplemente mostrar por pantalla los datos del pikachu en cuestion

public void mostrar(String nombre){
	System.out.println("Nombre: "+nombre+"Nivel: "+nivel+" Vida: "+vida);
	
}
}
