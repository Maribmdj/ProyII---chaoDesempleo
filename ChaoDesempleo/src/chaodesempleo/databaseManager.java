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

=======
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
    String sql = null;
    String url = null;
    static ResultSet rs;
<<<<<<< HEAD
=======

<<<<<<< HEAD
=======

=======
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654
>>>>>>> 7e9548d5f4f186f4c812bdbed6a1f683474dcdbb
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
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
    public ResultSet mostrarEmpresa() throws SQLException{
        sql = "{call getPersonCB()}";
        Statement s = conexion.createStatement();
        rs = s.executeQuery(sql);
        return rs;             
    }
    public ResultSet mostrarGradoA() throws SQLException{
        sql = "{call getADegreeCB()}";
        Statement s = conexion.createStatement();
        rs = s.executeQuery(sql);
        return rs;             
    }
    
    public ResultSet mostrarPuesto() throws SQLException{
        sql = "{call getJobPositionCB()}";
        Statement s = conexion.createStatement();
        rs = s.executeQuery(sql);
        return rs;             
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
        sql = "{call empresa_qpuestos()}";
        String sql = "{call empresa_qpuestos()}";
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654
>>>>>>> 7e9548d5f4f186f4c812bdbed6a1f683474dcdbb
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;             
    }
    
    public ResultSet Puestos(String pEmpresa, String pPuesto, String pEdad1, String pEdad2, String pGradoA, String pPublicado1, String pPublicado2) throws SQLException
    {
<<<<<<< HEAD
=======
<<<<<<< HEAD
        String sql = "{call puestos(?,?,?,?,?,?,?)}";
        Statement s = conexion.createStatement();
=======
<<<<<<< HEAD
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
        sql = "{call LISTADO_PUESTOS(?,?,?,?,?,?,?)}";
        //Statement s = conexion.createStatement();
        String sql = "{call LISTADO_PUESTOS(?,?,?,?,?,?,?)}";
<<<<<<< HEAD
=======
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654
>>>>>>> 7e9548d5f4f186f4c812bdbed6a1f683474dcdbb
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
        
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
        //ResultSet rs = cs.executeQuery(sql);
        //return rs; 
=======
<<<<<<< HEAD
        rs = cs.executeQuery(sql); 
        return rs;  
=======
<<<<<<< HEAD
        
        rs = cs.executeQuery(sql);
        return rs;
=======
        ResultSet rs = cs.executeQuery(sql);
        return rs; 
>>>>>>> e45775ef7bc9e4ae9deafe53f9ab28052599a654
>>>>>>> 7e9548d5f4f186f4c812bdbed6a1f683474dcdbb
>>>>>>> 2dc46ea4bd4bf2400153b6e5241cdfb3528e1e34
    }
    
    public ResultSet empresaxjobs(int i) throws SQLException{
         sql = "{call empresaxjobs(" + i + ")}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }    
    
    public ResultSet SolicitantesxProvincia() throws SQLException{
         sql = "{call SolicitantesxProvincia()}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }    

    public ResultSet SolicitantesxEdad() throws SQLException{
         sql = "{call SolicitantesxEdad()}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }

    public ResultSet SolicitantesxDistrito() throws SQLException{
         sql = "{call SolicitantesxDistrito()}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }    

    public ResultSet SolicitantesxCanton() throws SQLException{
         sql = "{call SolicitantesxCanton()}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }

    public ResultSet jobxsolicitantes(int i) throws SQLException{
         sql = "{call jobxsolicitantes(" + i + ")}";
        Statement cs = conexion.createStatement();
         rs = cs.executeQuery(sql);
        return rs;
    }
    
    public ResultSet solicitantexempresa(int i) throws SQLException{
        String sql = "{call solicitantexempresa(" + i + ")}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }
    
    public ResultSet edadesxempresa(int i) throws SQLException{
        String sql = "{call edadesxempresa(" + i + ")}";
        Statement cs = conexion.createStatement();
        ResultSet rs = cs.executeQuery(sql);
        return rs;
    }
    
}
