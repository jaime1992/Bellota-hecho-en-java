package Interfaz;


import java.sql.*;
public class ConexionBD5{
    
    public Connection conectar()
    {
        Connection cn = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://Felipe:1433;databaseName=Proyecto Bellota","bellota","123");
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return cn;
    }
}
