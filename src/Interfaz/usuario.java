/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.sql.*;

public class usuario {

    Connection cn;
    String clave;
    String nombreUsuario;

     public usuario()
    {
        ConexionBD5 con = new ConexionBD5();
        cn = con.conectar();
    }
    
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
   
    
    public boolean guardarUsuario()
    
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO usuario(clave,nombre) VALUES(?, ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,clave);
            cmd.setString(2, nombreUsuario);
           
            if(!cmd.execute())
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return resp;
    }
        
        
    public boolean consultarUsuario()
    {
       
        boolean resp = false;
        try
        {
            String sql = "SELECT * FROM usuario WHERE nombre=? " ;
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombreUsuario);
            //cmd.setString(2,clave);
            
            
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                resp = true;
                clave= rs.getString(2);
                nombreUsuario = rs.getString(1);
               
            }
            
            
            cmd.close();
            
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return resp;
    }  
   
   /** public boolean consultarUsuario2()
    {
         boolean resp = false;
        try
        {
            String sql = "SELECT * FROM usuario WHERE clave = ? " ;
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, clave);
            
            
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                resp = true;
                //clave= rs.getString(1);
                clave = rs.getString(1);
               
            }
            
           
            
            
            cmd.close();
            
            cn.close();
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return resp;
    }  
   
       **/ 
        
        
        
    
    
    public boolean modificarUsuario()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE usuario SET clave = ? WHERE nombre = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, clave);
            cmd.setString(2, nombreUsuario);
           
            if(!cmd.execute())
            {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception ex)
        {
          System.out.println("Error: " + ex.getMessage());
        }
        return resp;
    }
    
    
}