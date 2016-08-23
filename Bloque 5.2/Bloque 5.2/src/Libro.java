//Que tiene un libro? Atributos! Encapsulamiento: mayor cohesión.
//Ocultacion de informacion : private(no se podran acceder desde fuera de la clase) y public.
// todos los atributos casi siempre van de forma privada
public class Libro {
private String Titulo, Autor;
private int ISBM;
private double Precio;

public String getTitulo(){
	return Titulo;
	
}
public void setTitulo(String Titulo){
	this.Titulo = Titulo;
	
}

}
