/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;

/**
 *
 * @author DIEGO
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/museo?serverTimezone=UTC";
        try {
            //Class.forName("com.msql.jdbc.Driver");//linea necesaria para aplicaciones web
            Connection conexion = DriverManager.getConnection(url,"root","Dasf180999");
            Statement sentencia = conexion.createStatement();
            var sql = "SELECT * FROM museo";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id museo: "+resultado.getInt("mus_id"));
                System.out.println(" nombre museo: "+resultado.getString("mus_nombre"));
            }
            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
