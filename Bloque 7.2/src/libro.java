//final sirve para crear constantes. 
public class libro {
private final int ISBN;  //Atributo de tipofinal, una vez que le demos valor, nunca se puede cambiar el valor!
                        //Inicializando objeto.

public libro(int ISBN){ //Constructor, RESERVANdo memoria, se construye el objeto y despues se inicializan valores de los atributos
	this.ISBN = ISBN;
	
}
//Set and get


public int getISBN() {
	return ISBN;
}

//public void setISBN(){ //Tratando de modificar atributo final, pero no me deja porque me da error
	//this.ISBN = ISBN; 
	
//}

}
