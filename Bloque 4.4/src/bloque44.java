// DIRECCION DE MEMORIA.
public class bloque44 {
public static void main(String[] args){
	
	int[] v1 = {4, 5, 7, 8};
	int[] v2 = {4, 5, 7, 8};
	
	if(v1==v2){// cada una de las variables que tienen cualq programa en el mundo, vive en una parte de la pc
		//cada variable tiene una direccion de memoria diferente, por ende los vectores no son iguales.
		System.out.println("Ambos vectores son iguales.");
		
	}
	else{
		System.out.println("Ambos vectores NO son iguales.");
	}
	}
	
}

