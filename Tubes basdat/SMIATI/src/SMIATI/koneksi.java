/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMIATI;

/**
 *
 * @author Acer id
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer id
 */
public class koneksi {
    private static Connection conn;
    public static Connection getKoneksi(){
        String host = "jdbc:mysql://localhost/smiati_final",
               user = "root",
               pass = "";
       try{
           conn = (Connection) DriverManager.getConnection(host, user, pass);
       } catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
       }
       return conn;
    }

}
