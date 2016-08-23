import java.util.Scanner;

public class bloque22 {
public static void main(String[] arg){
	int letra;
	
	//letra = 'l';
	
	//if(letra =='a'){
		//System.out.println("El valor es a");
		
	//}
	//else{
		//System.out.println("El valor NO es a");
	//}
	letra = 3;
	switch(letra){
	case 1 :
		System.out.println("El valor es b");
		break;
	case 2 :
		System.out.println("El valor es a");
		break;
	case 3 :
		System.out.println("El valor es 3");
		break;
	case 4 :
		System.out.println("El valor es %");
		break;
		default:
			System.out.println("El valor que estás buscando no está en los case");
	}
}
}
