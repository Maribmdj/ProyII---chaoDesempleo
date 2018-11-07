package chaodesempleo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Esta clase se encarga de toda la conexion con MySQL
public class databaseManager {
    private Connection conexion = null;
    private static databaseManager manager;
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
        sql = "{call empresa_qpuestos()}";
        Statement s = conexion.createStatement();
        rs = s.executeQuery(sql);
        return rs;             
    }
    
    public ResultSet Puestos(String pEmpresa, String pPuesto, String pEdad1, String pEdad2, String pGradoA, String pPublicado1, String pPublicado2) throws SQLException
    {
        sql = "{call puestos(?,?,?,?,?,?,?)}";
        //Statement s = conexion.createStatement();
        
        CallableStatement cs = conexion.prepareCall(sql);     
        cs.setString(1, pEmpresa);
        cs.setString(2, pPuesto);
        cs.setString(3, pEdad1);
        cs.setString(4, pEdad2);
        cs.setString(5, pGradoA);
        cs.setString(6, pPublicado1);
        cs.setString(7, pPublicado2);
        
        rs = cs.executeQuery(sql);
        return rs;  
    }
    
    
}
