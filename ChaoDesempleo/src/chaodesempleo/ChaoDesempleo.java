/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaodesempleo;
import Utilidades.*;

/**
 *
 * @author Mariela
 */
public class ChaoDesempleo {
    static protected int currentUser;
    static protected databaseManager dbManager;
    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
         dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Naki2000+");
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Mysql");

        if(dbManager.getConexion()!= null){
            System.out.println("Database connected");
            java.awt.EventQueue.invokeLater(() -> {
                new Login().setVisible(true);
            });
        }else{
            System.out.println("Failed to connect");
        }
    }
}
