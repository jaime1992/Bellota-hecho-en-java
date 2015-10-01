
package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


    

public class Producto {
    

   Connection cn;
   String CodigoProducto;
   String Nombre;
   String Precio;
   String Cantidad;
   String Descripcion;

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   public Producto()
    {
        ConexionBD5 con = new ConexionBD5();
        cn = con.conectar();
    } 
   
  
   public boolean consultarProducto()
    {
       
        boolean resp = false;
        try
        {
            String sql = "SELECT * FROM Producto WHERE CodigoProducto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, CodigoProducto);
            ResultSet rs = cmd.executeQuery();
            if(rs.next())
            {
                resp = true;
                CodigoProducto = rs.getString(1);
                Nombre = rs.getString(2);
                Precio = rs.getString(3);
                Cantidad = rs.getString(4);
                Descripcion = rs.getString(5);
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
    
    
    public boolean guardarProducto()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO producto(CodigoProducto,Nombre, Precio, Cantidad, Descripcion) VALUES(?, ?, ?, ?,? )";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,CodigoProducto);
            cmd.setString(2, Nombre);
            cmd.setString(3, Precio);
            cmd.setString(4, Cantidad);
            cmd.setString(5, Descripcion);
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


public boolean modificarProducto()
    {
        boolean resp = false;
        try
        {
            String sql = "UPDATE Producto SET nombre = ?, precio = ?, "
                    + "Cantidad = ?, Descripcion = ? WHERE CodigoProducto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Nombre);
            cmd.setString(2, Precio);
            cmd.setString(3, Cantidad);
            cmd.setString(4, Descripcion);
            cmd.setString(5, CodigoProducto);
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
 

public boolean eliminarProducto()
    {
        boolean resp = false;
        try
        {
            String sql = "DELETE FROM Producto WHERE CodigoProducto = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,CodigoProducto);
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



