/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Anggadhita
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
        private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost/egg_game"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    } 
}
