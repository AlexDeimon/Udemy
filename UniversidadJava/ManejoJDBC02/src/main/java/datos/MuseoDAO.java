/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.Museo;
import java.sql.*;
import java.util.*;

/**
 *
 * @author DIEGO
 */
public class MuseoDAO {
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT mus_id, mus_nombre FROM museo";
    private static final String SQL_INSERT = "INSERT INTO museo(mus_id, mus_nombre) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE museo SET mus_nombre = ? WHERE mus_id = ?";
    private static final String SQL_DELETE = "DELETE FROM museo WHERE mus_id = ?";

    public MuseoDAO() {
    }

    public MuseoDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    
    public List<Museo> seleccionar() throws SQLException{
        Connection conex = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Museo museo = null;
        List<Museo> museos = new ArrayList<>();
        
        try {
            conex = this.conexionTransaccional!= null ? this.conexionTransaccional: Conexion.getConection();
            stmt = conex.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idMuseo = rs.getInt("mus_id");
                String nombreMuseo = rs.getString("mus_nombre");
                
                museo = new Museo(idMuseo, nombreMuseo);
                museos.add(museo);
            }
        } finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){
                    Conexion.close(conex);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return museos;
    }
    
    public int insertar(Museo museo) throws SQLException{
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = this.conexionTransaccional!= null ? this.conexionTransaccional: Conexion.getConection();
            stmt = conex.prepareStatement(SQL_INSERT);
            stmt.setInt(1, museo.getIdMuseo());
            stmt.setString(2, museo.getNombreMuseo());
            registros = stmt.executeUpdate();
        }finally{
            try {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){
                    Conexion.close(conex);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Museo museo) throws SQLException{
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = this.conexionTransaccional!= null ? this.conexionTransaccional: Conexion.getConection();
            stmt = conex.prepareStatement(SQL_UPDATE);
            stmt.setString(1, museo.getNombreMuseo());
            stmt.setInt(2, museo.getIdMuseo());
            registros = stmt.executeUpdate();
        }finally{
            try {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){
                    Conexion.close(conex);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int eliminar(Museo museo) throws SQLException{
        Connection conex = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conex = this.conexionTransaccional!= null ? this.conexionTransaccional: Conexion.getConection();
            stmt = conex.prepareStatement(SQL_DELETE);
            stmt.setInt(1, museo.getIdMuseo());
            registros = stmt.executeUpdate();
       }finally{
            try {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){
                    Conexion.close(conex);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
