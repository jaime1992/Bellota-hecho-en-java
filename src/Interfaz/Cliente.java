/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.sql.*;
import javax.swing.JOptionPane;

public class Cliente 
{


    Connection cn;
    String RutCliente;
    String nombre;
    String apellido;
    String telefono;
    String correo;

    public String getRutCliente() {
        return RutCliente;
    }

    public void setRutCliente(String RutCliente) {
        this.RutCliente = RutCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
   
    public Cliente()
    {
        ConexionBD5 con = new ConexionBD5();
        cn = con.conectar();
    }
    
   
    public boolean guardarCliente()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Cliente(RutCliente,nombre, apellidos, telefono, correo) VALUES(?, ?, ?, ?,? )";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,RutCliente);
            cmd.setString(2, nombre);
            cmd.setString(3, apellido);
            cmd.setString(4, telefono);
            cmd.setString(5, correo);
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

  public static boolean validarRut(String rut) {  
  
  boolean validacion = false;  
  try 
  {  
   rut =  rut.toUpperCase();  
   rut = rut.replace(".", "");  
   rut = rut.replace("-", "");  
   int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));  
  
   char dv = rut.charAt(rut.length() - 1);  
  
   int m = 0, s = 1;  
   for (; rutAux != 0; rutAux /= 10) 
   {  
   s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;  
   }  
   if (dv == (char) (s != 0 ? s + 47 : 75)) 
   {  
   validacion = true;  
   }  
  
   } catch (java.lang.NumberFormatException e) {  
   } catch (Exception e) {  
   }  
   return validacion;  
}
    
    
public boolean consultarCliente()
    {
       
        boolean resp = false;
        try
        {
            String sql = "SELECT * FROM Cliente WHERE RutCliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, RutCliente);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                resp = true;
                RutCliente = rs.getString(1);
                nombre = rs.getString(2);
                apellido = rs.getString(3);
                telefono = rs.getString(4);
                correo = rs.getString(5);
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



public boolean modificarUsuario()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Cliente SET nombre = ?, apellidos = ?, "
                    + "correo = ?, telefono = ? WHERE RutCliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre);
            cmd.setString(2, apellido);
            cmd.setString(3, correo);
            cmd.setString(4, telefono);
            cmd.setString(5, RutCliente);
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

public boolean eliminarCliente()
    {
        boolean resp = false;
        try
        {
            String sql = "DELETE FROM cliente WHERE RutCliente = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, RutCliente);
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
    

