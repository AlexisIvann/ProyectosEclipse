
public class Guerrero {
 private String Nombre;
 private int salud, fuerza;
 
 public String getNombre(){ //get
	 return Nombre; //metodo completo. devolver el valor del atributo nombre
	 // para que desde una clase exterior pueda ver cual es ese valor
	 //esto es tipo string.
 }
 //set : asignar valores, no devuelve(void)
 public void setNombre(String Nombre){//crear un nuevo atributo
	 this.Nombre = Nombre; // el valor del atributo Nombre, se lo asignamos al atributo nombre de la clase.
 }
}
