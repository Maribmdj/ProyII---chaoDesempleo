package chaodesempleo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Esta clase se encarga de toda la conexion con MySQL
public class databaseManager {
    private Connection conexion = null;
    private static databaseManager manager;

    public static databaseManager getManager(String url, String username, String pw){
        if(manager == null)
        {
            manager = new databaseManager(url, username, pw);
        }
        return manager;
    }

    private databaseManager(String url, String username, String pw){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver registered");
        }catch(ClassNotFoundException e){
            System.out.println("No mysql JDBC Driver found, " + e.getMessage());
        }
        
        try{
            this.conexion = DriverManager.getConnection(url, username, pw);
        }catch(SQLException e){
            System.out.println("Connection failed, " + e.getMessage());
        }
        
    }
    
    //Este método retorna la conexion de la BD
    public Connection getConexion() {
        return conexion;
    }
    
    public int validateUser(String name, char[] pw) throws SQLException{
        int result;
        CallableStatement cs = conexion.prepareCall("{? = call validateuser(?, ?)}");
        cs.registerOutParameter(1, java.sql.Types.INTEGER);
        cs.setString(2, name);
        cs.setString(3, String.valueOf(pw));
        cs.execute();
        result = cs.getInt(1);
        return result;
    }
    
    
    
}
