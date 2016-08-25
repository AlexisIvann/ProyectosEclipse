
public class UsoLibro {
	
	public static void main(String[] args){
		
		Libro libro1=new Libro("P en Java", "Juan", 25); //instancias iguales. lo unico que debería ser diferente es el codigo ISBN. 
		Libro libro2=new Libro("P en Java", "Juan", 25);
		
		if(libro1.equals(libro2)){//no es capaz de distinguir si los objetos son iguales o no, por eso dicen que son libros diferentes.
			System.out.println("Es el mismo libro");
			
		}else{
			System.out.println("No es el mismo libro");
		}
	}

}
