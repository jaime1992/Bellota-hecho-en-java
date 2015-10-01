package Bellota;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Interfaz.*;

public class ConexionBD {
     ConexionBD(){
          try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //cargando driver
           Connection con= DriverManager.getConnection("jdbc:sqlserver://Felipe:1433;databaseName=Proyecto Bellota","bellota","123");
           Statement sentencia=con.createStatement();
           ResultSet rs = sentencia.executeQuery("select * from Boleta");
           
           while(rs.next()){
               System.out.println("===================================");
               System.out.println("Codigo Boleta : "+ rs.getInt("CodigoBoleta"));
               System.out.println("Monto: "+ rs.getInt("Monto"));
               System.out.println("Rut Vendedor: "+ rs.getInt("RutVendedor"));
               System.out.println("Codigo Tienda: "+ rs.getInt("CodigoTienda"));
               System.out.println("Fecha: "+ rs.getInt("CodigoFecha"));
               System.out.println("Codigo Producto: "+ rs.getInt("CodigoProducto"));
               System.out.println("===================================");
           }
           
           }catch(Exception ex){
               JOptionPane.showMessageDialog(null,ex);
            }
          
          
     }
     
     
       public static void main(String[]args){
               ConexionBD con= new ConexionBD();
          }
      
          
}
  