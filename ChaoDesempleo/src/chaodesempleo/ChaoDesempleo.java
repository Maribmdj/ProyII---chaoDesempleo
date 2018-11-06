/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaodesempleo;

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
<<<<<<< HEAD
    public static void main(String[] args) {       
        //dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Naki2000+");
        dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Mysql");

=======
    public static void main(String[] args) {
        

        dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Naki2000+");
        dbManager = databaseManager.getManager("jdbc:mysql://localhost:3306/chaodesempleo?verifyServerCertificate=false&useSSL=true", "root", "Mysql");
>>>>>>> ba3250db7bb448d3e31add32c72dfd3d5d813cd4
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
