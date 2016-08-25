import java.util.*;


public class CuentasUsuarios {
public static void main(String[] args) {
		
Clientes cl1 = new Clientes("Antonio Banderas", "00001", 20000);//agregando parametros a las instancias

Clientes cl2 = new Clientes("Rafael Nadal", "0002", 25000);

Clientes cl3 = new Clientes("Penelope Cruz", "0003", 30000);

Clientes cl4 = new Clientes("Julio Iglesias", "0004", 50000);
//Antes de elegir la coleccion adecuada:
//Se repiten clientes? 
// Agregar borrar?
// solo lectura?


Set <Clientes> clientesBanco= new HashSet <Clientes>(); 
//agregar usando add, los objetos de tipo cliente a la coleccion clientesbanco
clientesBanco.add(cl1);
clientesBanco.add(cl2);
clientesBanco.add(cl3);
clientesBanco.add(cl4);

Iterator<Clientes> it=clientesBanco.iterator();//creando iterador clientes

while(it.hasNext()){//mientras haya un elemento a continuacion
	String nombre_cliente=it.next().getNombre();//creando variable de tipo nombre_cliente 
	
	if(nombre_cliente.equals("Julio Iglesias")){//si el nombre es igual a julio iglesias
		
		it.remove();//borrarlo con el iterador!
	}
}







//Recorrer coleccion

for(Clientes clientes : clientesBanco){
	System.out.println(clientes.getNombre()+ " "+ clientes.getN_cuenta() + " "+ clientes.getSaldo()); //Nos muestra los objetos de la coleccion sin ordenar.
}

//OTRA FORMA DE RECORRER LISTA CON ITERATOR(MAS EFICIENTE Y FACIL EL FOR)
//Iterator<Clientes> it=clientesBanco.iterator(); //objeto iterador que es capaz recorrer nuestra collecion de clientesbanco
//while(it.hasNext()){//mientras haya cosas que recorrer
//String nombre_cliente=it.next().getNombre();//next: da un salto elemento a elemento
//System.out.println(nombre_cliente);

//}	
}

}
