
package com.mycompany.northwind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bpenc
 */
public class Conexion {
    public static void main(String[] args) {
        Conexion();
        
    }
    
    public static void Conexion(){
        //objeto
        Connection conm = null;
        
        try {
            conm = DriverManager.getConnection("jdbc:mysql://localhost:3306/Northwind?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            if (conm !=null){
                System.out.println("Conexion realizada exitosamente");
            }
        } catch (SQLException e) {
            System.out.println("ha ocurrido un error en la conexion \n"+ e.getMessage());
        }

    }
}
