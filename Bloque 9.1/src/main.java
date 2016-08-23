//Interfaces:similar a las clases abstractas.
public class main {
public static void main(String[] args){
	//hijo h =new hijo(1,2,3); //polimorfismo de referencias
	//claseAbstracta c = new hijo(1,2,3);
	
	hijo h = new hijo();
	
	Interfaz i = new hijo(); //
	System.out.println(i.getNum1());
	
	
}
}
