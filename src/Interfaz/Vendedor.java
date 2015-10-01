package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Vendedor {
    Connection cn;
    String RutVendedor;
    String Nombres;
    String Apellidos;
    String Telefono;
    String EstadoCivil;
    String Comuna;
    
    public Vendedor()
    {
        ConexionBD5 con = new ConexionBD5();
        cn = con.conectar();
    }
    
    public String getRutVendedor() {
        return RutVendedor;
    }

    public void setRutVendedor(String RutVendedor) {
        this.RutVendedor = RutVendedor;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }

    
    public boolean guardarVendedor()
    {
        boolean resp = false;
        try
        {
            String sql = "INSERT INTO Vendedor(RutVendedor,Nombres, Apellidos, Telefono, EstadoCivil,Comuna) VALUES(?,?, ?, ?, ?,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,RutVendedor);
            cmd.setString(2,Nombres);
            cmd.setString(3,Apellidos);
            cmd.setString(4,Telefono);
            cmd.setString(5,EstadoCivil);
            cmd.setString(6,Comuna);
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
    
        public boolean modificarVendedor()
    {
        boolean resp = false;
        try
        {
             String sql = "UPDATE Vendedor SET Nombres = ?, Apellidos = ?, "
                    + "Telefono = ?, EstadoCivil = ?, Comuna = ? WHERE RutVendedor = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Nombres);
            cmd.setString(2, Apellidos);
            cmd.setString(3, Telefono);
            cmd.setString(4, EstadoCivil);
            cmd.setString(5,Comuna);
            cmd.setString(6, RutVendedor);
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
    
public boolean eliminarVendedor()
    {
        boolean resp = false;
        try
        {
            String sql = "DELETE FROM Vendedor WHERE RutVendedor= ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,RutVendedor);
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
    
    

