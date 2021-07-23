/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entidades.Museo;
import datos.MuseoDAO;
import java.util.List;

/**
 *
 * @author DIEGO
 */
public class TestManejoMuseos {
    public static void main(String[] args) {
        MuseoDAO museodao = new MuseoDAO();
        
        //insertando museo
        Museo nuevomuseo = new Museo(305,"Stmisoniano");
        museodao.insertar(nuevomuseo);
        
        //actualizando obra existente
        Museo museoact = new Museo(305,"Smithsoniano");
        museodao.actualizar(museoact);
        
        //eliminar obra
        Museo museoeliminar = new Museo(305);
        museodao.eliminar(museoeliminar);
        
        //listando obras
        List<Museo> obras = museodao.seleccionar();
        obras.forEach(museo -> {
            System.out.println("museo = " + museo);
        });
    }
}
