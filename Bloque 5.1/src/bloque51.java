//POO: Objetos y clases
//Solamente existe un main, y acá se crea un objeto.
// objetos = atributos de una clase.
public class bloque51 {
public static void main (String[] args){
	Guerrero g1 = new Guerrero();
	Guerrero g2 = new Guerrero();
	
	
	g1.Nombre = "Goku"; //propios atributos
	g1.fuerza = 99;
	g1.salud = 99;
	
	g2.Nombre = "Vegeta"; //propios atributos, valores diferentes.
	g2.fuerza = 80;
	g2.salud = 80;
	
	System.out.println("El nombre de mi guerrero es: "+g1.Nombre);
	System.out.println("El nombre de mi guerrero es: "+g2.Nombre);
	}
}
