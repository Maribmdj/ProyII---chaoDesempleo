/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chaoDesempleo?autoReconnect=true&useSSL=false", "root", "Naki2000+");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}    
