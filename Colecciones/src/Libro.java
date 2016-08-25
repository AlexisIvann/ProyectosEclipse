
public class Libro {
	//Propiedades de un objeto de la clase libro encapsulados.
	private String titulo;
	private String autor;
	private int ISBN;
	//Constructor
	public Libro(String titulo, String autor, int ISBN){ 
		
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		
	}
	//Getter
	public String getDatos(){
		return "El título es: " + titulo + " El autor es: " + autor + " Y el ISBN es: " + ISBN;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Libro){ //en el caso del obj que te estoy pasando es una instancia de la clase libro,
		Libro otro=(Libro)obj;//casting
		if(this.ISBN==otro.ISBN){//son iguales los isbn?
			return true;
			
		}
		else{
			return false;
		}
		
		}else{
			return false;
		}
	}
}
