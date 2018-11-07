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
<<<<<<< HEAD
        //Alvaro
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
        //Mariela
        dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Mysql");
=======
         dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654

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
