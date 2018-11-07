package chaodesempleo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//Esta clase se encarga de toda la conexion con MySQL
public class databaseManager {
    private Connection conexion = null;
    private static databaseManager manager;
    CallableStatement cs = null;
    String sql = null;
    String url = null;
    static ResultSet rs;

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
    
    public ResultSet empresa_QPuestos() throws SQLException{
        //int result;
        System.out.println("Entra sp 1");
        sql = "{call empresa_qpuestos(?)}";
        try {
            System.out.println("Entra sp 2");
            cs = conexion.prepareCall(sql);
            cs.registerOutParameter(1, java.sql.Types.REF_CURSOR);
            System.out.println("Entra sp 3");
            cs.execute();            
            System.out.println("Entra sp 4");
            rs = (ResultSet) cs.getObject(1);            
            //result = cs.getInt(1);
            return rs;
            
        }catch (Exception e)
            { e.printStackTrace(); } 
        return rs;
        
    }
    
    
}
