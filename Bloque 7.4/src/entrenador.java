public class entrenador {

	private String nombre;
	private int cont = 0, tam = 2; 
	
	private pikachu[] mochila = new pikachu[tam]; //vector de objetos de tipo pikachu
	                                              //tiene el tamaño de tam o sea 2. puedo capturar a 2
	
	                                             //mochila:pokemons que tengo capturados.
	

	//Constructor
	public entrenador(String nombre){ //pasarle un nombre
		this.nombre = nombre; //el nombre se lo damso a nombre
		
		mochila[cont] = new pikachu(); // cont = 0; vector de objetos de tipo pikachu
		                               
		cont++; //cont = 1, la posicion en la que se va a ocupar el nuevo pokeomon
		
	}

	//Getter
	public String getNombre(){ //mostrar nombre por pantalla
		return nombre;
	}
	//metodos
	//Se elige un pikachu de la mochila en funcion del indice recibido(i) y se devuelve,
	// si el indice no se encuentra en el vector se devuelve null
	
	public pikachu elige(int i){// empieza en 0
		if (i < cont){ // cont es el lugar donde a partir de ahi esta vacio el vector
			return mochila[i]; 
		}
		else{
			return null;
			
		}
	}
		//Metodo que se llama cuando un entrenador trata de capturar a un pikachu, devuelve
		//un booleano confirmando si lo ha capturado o no, y solo lo capturara si existe
		//hueco en la mochila
		
		public boolean captura(pikachu enemigo) { //pokemon que intentamos caputrar
			
			boolean capturado = false; //el boolean que nos dice si lo capturamos o no
			
			if(enemigo.getVida() <=20){//si la vida es menor que 20, si podemos
				if (cont < tam){//si el cont es menor que el tamaño, lo podemos capturar
					mochila[cont] = enemigo; //metemos pokemon a la mochila
					capturado = true;
					cont++;
					
					System.out.println("Has capturado un nuevo pikachu!");
					
				}
				else{
					System.out.println("La mochila está llena.");
					
				}
				
			}
			else{
				System.out.println("Imposible de capturar."); //cuando la vida es mayor que 20
				
			}
			return capturado;
		}
		//Metodo que muestra los pikachus que tenemos en la mochila junto con sus caracteristicas
		public void mostrar_mochila(){
			System.out.println("Tienes:"+cont+" Pikachus");
			
			for(int i = 0; i < cont; i++){
				System.out.println("Nº:"+i+ " Nivel:" +mochila[i].getNivel()+" Vida:"+mochila[i].getVida());
			}
		}
		
		
	}
	
	

