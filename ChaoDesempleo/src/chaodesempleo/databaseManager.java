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
<<<<<<< HEAD
    String sql = null;
    String url = null;
    static ResultSet rs;

=======
    
>>>>>>> f4d096f7b387073cc4c4dccbd7b9e7fded4b79dc
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
    
    public int getTypeByUser(int id) throws SQLException{
        String sql = "{call gettypebyuser("+id+")}";
        Statement cs = conexion.createStatement();
        ResultSet res = cs.executeQuery(sql);
        if (res.next()){
            return res.getInt(1);
        }
        return -1;
    }
    
    public ResultSet empresa_QPuestos() throws SQLException{
<<<<<<< HEAD
        sql = "{call empresa_qpuestos()}";
=======
        String sql = "{call empresa_qpuestos()}";
>>>>>>> f4d096f7b387073cc4c4dccbd7b9e7fded4b79dc
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;             
    }
    
    public ResultSet Puestos(String pEmpresa, String pPuesto, String pEdad1, String pEdad2, String pGradoA, String pPublicado1, String pPublicado2) throws SQLException
    {
        String sql = "{call puestos(?,?,?,?,?,?,?)}";
        //Statement s = conexion.createStatement();
        
        CallableStatement cs = conexion.prepareCall(sql);     
        cs.setString(1, pEmpresa);
        cs.setString(2, pPuesto);
        cs.setString(3, pEdad1);
        cs.setString(4, pEdad2);
        cs.setString(5, pGradoA);
        cs.setString(6, pPublicado1);
        cs.setString(7, pPublicado2);
        
<<<<<<< HEAD
        rs = cs.executeQuery(sql);
        return rs;  
        sql = "{call empresa_qpuestos()}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
=======
        ResultSet rs = cs.executeQuery(sql);
        return rs;  
>>>>>>> f4d096f7b387073cc4c4dccbd7b9e7fded4b79dc
    }
    
    public ResultSet empresaxjobs(int i) throws SQLException{
        String sql = "{call empresaxjobs(" + i + ")}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }    
    
    public ResultSet SolicitantesxProvincia() throws SQLException{
        String sql = "{call SolicitantesxProvincia()}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }    

    public ResultSet SolicitantesxEdad() throws SQLException{
        String sql = "{call SolicitantesxEdad()}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }

    public ResultSet SolicitantesxDistrito() throws SQLException{
        String sql = "{call SolicitantesxDistrito()}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }    

    public ResultSet SolicitantesxCanton() throws SQLException{
        String sql = "{call SolicitantesxCanton()}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }

    public ResultSet jobxsolicitantes(int i) throws SQLException{
        String sql = "{call jobxsolicitantes(" + i + ")}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }
    
    public ResultSet solicitantexempresa(int i) throws SQLException{
        String sql = "{call solicitantexempresa(" + i + ")}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }
    
}
