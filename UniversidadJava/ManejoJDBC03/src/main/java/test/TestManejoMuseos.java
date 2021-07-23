/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entidades.MuseoDTO;
import datos.Conexion;
import datos.MuseoDao;
import datos.MuseoDaoJDBC;
import java.sql.*;
import java.util.*;

/**
 *
 * @author DIEGO
 */
public class TestManejoMuseos {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if(conexion.getAutoCommit()){//evitar autocomit
                conexion.setAutoCommit(false);
            }
            
            MuseoDao museodao = new MuseoDaoJDBC(conexion);
            
            List<MuseoDTO> museos = museodao.select();
            museos.forEach(museo -> {
                System.out.println("museo = " + museo);
            });
            
            conexion.commit();//realiza commit SI las operaciones anteriores fueron exitosas
            System.out.println("Se hizo commit correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollBack");
            try {
                conexion.rollback(); //Error si no se hizo Commit
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        //insertando museo
        
        
        //actualizando obra existente
//        MuseoDTO museoact = new MuseoDTO(305,"Smithsoniano");
//        museodao.actualizar(museoact);
//        
//        //eliminar obra
//        MuseoDTO museoeliminar = new MuseoDTO(305);
//        museodao.eliminar(museoeliminar);
//        
//        //listando obras
//        List<Museo> obras = museodao.seleccionar();
//        obras.forEach(museo -> {
//            System.out.println("museo = " + museo);
//        });
    }
}
