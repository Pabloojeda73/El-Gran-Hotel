/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PabloOjeda
 */
public class TratamientoData {
    private Connection connection = null;
    
    public TratamientoData (Conexion conexion) {
        try {
            connection = conexion.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO Tratamientos (tipo, importe, descripcion, activo) VALUES ( ? , ? , ? , ? );";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tratamiento.getTipo());
            statement.setDouble(2, tratamiento.getImporte());
            statement.setString(3, tratamiento.getDescripcion());
            statement.setBoolean(4, tratamiento.isActivo());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if(rs.next()) {
                tratamiento.setId(rs.getInt("id"));
            } else {
                System.out.println("No se pudo obtener el id del tratamiento creado.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Tratamiento> obtenerTratamientos () {
        List<Tratamiento> tratamientos = new ArrayList<>();
        
        String sql = "SELECT * FROM Tratamientos;";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            Tratamiento tratamiento;
            while (rs.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setActivo(rs.getBoolean("activo"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setId(rs.getInt("id"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setTipo(rs.getString("tipo"));
                
                tratamientos.add(tratamiento);
            }
            
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TratamientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tratamientos;
    }
    
    
    
    
}
