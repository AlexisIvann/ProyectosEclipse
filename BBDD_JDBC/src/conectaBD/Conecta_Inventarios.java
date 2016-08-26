package conectaBD;
import java.sql.*;
public class Conecta_Inventarios {
public static void main(String[] args){
	

	try{
		//1. CREAR CONEXION
		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventarios", "root", "");
		
		//2. CREAR OBJETO STATEMENT
		Statement miStatement = miConexion.createStatement();
		
		//3. EJECUTAR SENTENCIA SQL
		ResultSet miResultset= miStatement.executeQuery("SELECT * FROM INVENTARIOS");//ResultSet es una tabla virtual
		
		//4. RECORRER EL RESULTSET
		while(miResultset.next()){//mientras haya un siguiente registro resultset más
		
			System.out.println(miResultset.getString("NombresCliente") + "" + miResultset.getString("ApellidosCliente"));
			
		
		}
		
	}catch(Exception e){
		System.out.println("No conecta!");
		e.printStackTrace(); // En el caso de que haya error, nos ayuda en donde puede estar el error
	}
	
}
}