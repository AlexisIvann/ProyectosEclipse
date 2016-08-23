//ORDENAR UN VECTOR DE MENOR A MAYOR MEDIANTE EL METODO DE LA BURBUJA
public class bloque43 {
public static void main(String[] arg){

	int[]vec = {7,8,9,4,5,6};
	int aux;
	for (int i = 0; i < vec.length; i++){
		System.out.print(vec[i]+" ");
		
	}
	System.out.println();
	for(int i=0; i < vec.length; i++){
		for(int j = i+1; j < vec.length; j++ ){
			if(vec[j] <  vec[i]){
				aux = vec[j];
				vec [j] = vec[i];
				vec [i] = aux;
				
			}
		}
	}
	for(int i= 0; i <  vec.length; i++){
		System.out.print(vec[i]+" ");
	}
}
}
