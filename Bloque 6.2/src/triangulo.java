
public class triangulo {

	private int area; //atributo de tipo entero

	private static String nombre;
	
public triangulo (int area){ //constructor.
	this.area = area;

	
	}	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		triangulo.nombre = nombre;
	}
	
	
}
