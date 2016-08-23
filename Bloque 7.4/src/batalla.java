import java.util.Scanner;
public class batalla {

	private entrenador yo;
	private Scanner S = new Scanner(System.in);
	
	private pikachu enemigo, mio; //referencia del enemigo y un pokemon mio
	
	//Constructor
	public batalla (entrenador yo) { 
		this.yo = yo;
		
	}
	
	//Batalla 
	//Con este metodo se comienza la batalla y el se encarga de llamar al resto de metodos
	public void comienza(){
	enemigo = new pikachu(); //genero un enemigo de forma automatica. se convierte en objeto
	mio = elige(); 
	pelea();
	}
	
	//Genera la pelea entre los dos pikachus, de modo que se puede elegir que ataque realizar
	public void pelea() {
		boolean disponible = true;
		int opcion;
		
		do{
			enemigo.mostrar("Enemigo");  //muestra estadisticas de enemigo por pantalla
					mio.mostrar("Mio");
					
		do{
			System.out.println("Elige que ataque realizar: ");
			System.out.println("1: Placaje. PM:"+mio.getPm1());
			System.out.println("2: Rayo. PM:"+mio.getPm2());
			System.out.println("3: Captura al enemigo");
			
			System.out.println("Seleccione una opción: ");
			opcion = S.nextInt();
			
		}while(opcion < 0 || opcion > 3); // si la opcion es adecuada pasamos al switch
		
		switch(opcion){ // llamar serie de metodos.
		case 1:
			enemigo.daño_recibido(mio.placaje());
			break;
		case 2:
			enemigo.daño_recibido(mio.rayo());
			break;
		case 3:
			disponible = !(yo.captura(enemigo)); //Booleano disponible. si caputo un pokemon con metodo caputra
			
		}
		
		}while(mio.getVida() > 0 && enemigo.getVida() > 0 && disponible);
		
		
	}
	
	//Con este metodo se elige a que pikachu utilizar en la batlla
	public pikachu elige(){
		int opcion;
		System.out.println("Elige tu pokemon: ");
		opcion = S.nextInt();
	return yo.elige(opcion);
	}
	
	
}
