// objeto t1 es totalmente independiente del objeto t2, t1 tiene su propio atributo area, y t2 tambien tiene su propia area
public class main {

	public static void main(String[] args){
		triangulo t1 = new triangulo(10); //objeto clase triangulo, con el valor del area.
		triangulo t2 = new triangulo(20);
		
		triangulo.setNombre("Empiza a programar"); //con los metodos estaticos, podemos asignarle valores, sin crear ningun tipo de objeto.
		
		System.out.println("El nombre es: "+triangulo.getNombre());
		
		
		
		System.out.println("El valor del triangulo t1 es:"+t1.getArea()); //mostrando valor de las areas de sus respectivos triangulos
		System.out.println("El valor del triangulo t2 es:"+t2.getArea());
		
		
		
 
	}
}
