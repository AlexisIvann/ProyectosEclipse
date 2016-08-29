
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

 private String _usuario="root";
 private String _pwd= "pirula123";
 private static String _bd="inventarios"; //base de datos que nos queremos conectar
 static String _url = "jdbc:mysql://localhost/"+_bd;
 private Connection conn = null;
 
 public jdbc() {
  
   try{
     Class.forName("com.mysql.jdbc.Connection");
     conn = (Connection)DriverManager.getConnection(_url, _usuario, _pwd);
     if(conn != null)
     {
       System.out.println("Conexion a base de datos "+_url+" . . . Ok");
     }
   }
   catch(SQLException ex)
   {
      System.out.println("Hubo un problema al intentar conecarse a la base de datos"+_url);
   }
   catch(ClassNotFoundException ex)
   {
      System.out.println(ex);
   }  
 }
 
 public ResultSet getQuery(String _query) //recibir un valor o una variable de tipo string
 {
    Statement state = null;
    ResultSet resultado = null;
    try{
      state = (Statement) conn.createStatement();
      resultado = state.executeQuery(_query);
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
    return resultado;
 }
 
 public void setQuery(String _query){ //modificaciones en la base de datos

    Statement state = null;
  
    try{   
      state=(Statement) conn.createStatement();
      state.execute(_query);

    }catch (SQLException e){
      e.printStackTrace();
    }
 }
}
