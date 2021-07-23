/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entidades.Obra;
import datos.ObraDAO;
import java.util.*;

/**
 *
 * @author DIEGO
 */
public class TestManejoObras {
    public static void main(String[] args) {
        ObraDAO obradao = new ObraDAO();
        
        //insertando obra
        Obra nuevaobra = new Obra(201,"La monalisa","pintura",100,101);
        obradao.insertar(nuevaobra);
        
        //actualizando obra existente
        Obra obraact = new Obra(201,"La Monalisa","pintura",1000,101);
        obradao.actualizar(obraact);
        
        //eliminar obra
        Obra obraeliminar = new Obra(201);
        obradao.eliminar(obraeliminar);
        
        //listando obras
        List<Obra> obras = obradao.seleccionar();
        obras.forEach(obra -> {
            System.out.println("obra = " + obra);
        });
    }
}
