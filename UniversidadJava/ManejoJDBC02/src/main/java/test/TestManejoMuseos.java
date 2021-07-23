/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entidades.Museo;
import datos.Conexion;
import datos.MuseoDAO;
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
            MuseoDAO museodao = new MuseoDAO(conexion);
            
            Museo nuevomuseo = new Museo();
            nuevomuseo.setIdMuseo(305);
            nuevomuseo.setNombreMuseo("Smitsonian");
            museodao.insertar(nuevomuseo);
            
            Museo museoact = new Museo();
            museoact.setIdMuseo(305);
            museoact.setNombreMuseo("Smitsoniano");
            museodao.actualizar(museoact);
            
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
//        Museo museoact = new Museo(305,"Smithsoniano");
//        museodao.actualizar(museoact);
//        
//        //eliminar obra
//        Museo museoeliminar = new Museo(305);
//        museodao.eliminar(museoeliminar);
//        
//        //listando obras
//        List<Museo> obras = museodao.seleccionar();
//        obras.forEach(museo -> {
//            System.out.println("museo = " + museo);
//        });
    }
}
