/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author M. ade nur Alfarisi
 */
public class koneksi {
    Connection con;
    
    
    public void convig(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bluebeauty", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal" +e.getMessage());
            
        }
    }
    
}
