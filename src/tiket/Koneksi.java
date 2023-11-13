/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
    
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                
                String url = "jdbc:mysql://localhost/ka";
                String user = "root";
                String pass = "";
                
                koneksi = (Connection) DriverManager.getConnection(url,user,pass);
                //JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Koneksi Gagal");
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    
}
