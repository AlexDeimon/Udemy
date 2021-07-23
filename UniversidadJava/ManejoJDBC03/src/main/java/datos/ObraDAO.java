/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.Obra;
import java.sql.*;
import java.util.*;

/**
 *
 * @author DIEGO
 */
public class ObraDAO {
    private static final String SQL_SELECT = "SELECT obr_id, obr_nombre, obr_tipo, obr_costo, exp_id FROM obra";
    private static final String SQL_INSERT = "INSERT INTO obra(obr_id, obr_nombre, obr_tipo, obr_costo, exp_id) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE obra SET obr_nombre = ?, obr_tipo = ?, obr_costo = ?, exp_id = ? WHERE obr_id = ?";
    private static final String SQL_DELETE = "DELETE FROM obra WHERE obr_id = ?";
    public List<Obra> seleccionar(){
        Connection conex = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Obra obra = null;
        List<Obra> obras = new ArrayList<>();
        
        try {
            conex = Conexion.getConection();
            stmt = conex.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idObra = rs.getInt("obr_id");
                String nombreObra = rs.getString("obr_nombre");
                String tipoObra = rs.getString("obr_tipo");
                int costoObra = rs.getInt("obr_costo");
                int idExp = rs.getInt("exp_id");
                
                obra = new Obra(idObra, nombreObra, tipoObra, costoObra, idExp);
                obras.add(obra);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conex);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return obras;
    }
    
    public int insertar(Obra obra){
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = Conexion.getConection();
            stmt = conex.prepareStatement(SQL_INSERT);
            stmt.setInt(1, obra.getIdObra());
            stmt.setString(2, obra.getNombreObra());
            stmt.setString(3, obra.getTipoObra());
            stmt.setInt(4, obra.getCostoObra());
            stmt.setInt(5, obra.getIdExp());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conex);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Obra obra){
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = Conexion.getConection();
            stmt = conex.prepareStatement(SQL_UPDATE);
            stmt.setString(1, obra.getNombreObra());
            stmt.setString(2, obra.getTipoObra());
            stmt.setInt(3, obra.getCostoObra());
            stmt.setInt(4, obra.getIdExp());
            stmt.setInt(5, obra.getIdObra());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conex);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int eliminar(Obra obra){
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = Conexion.getConection();
            stmt = conex.prepareStatement(SQL_DELETE);
            stmt.setInt(1, obra.getIdObra());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conex);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    
}
