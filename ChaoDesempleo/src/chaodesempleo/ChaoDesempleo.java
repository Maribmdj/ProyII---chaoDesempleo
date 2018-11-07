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
=======
<<<<<<< HEAD
         dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Naki2000+");
=======
<<<<<<< HEAD
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
        //Alvaro
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
        //Mariela
        dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Mysql");
<<<<<<< HEAD
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
=======
=======
         dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "mysql");
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654
>>>>>>> 7e9548d5f4f186f4c812bdbed6a1f683474dcdbb
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34

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
