package chaodesempleo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Esta clase se encarga de toda la conexion con MySQL
public class Conexion {
    private Connection conexion;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Mysql";
    private static final String url = "jdbc:mysql://localhost:3306/chaodesempleo";
    
    
    public void Conectar(){
        conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion!=null){
                System.out.println("Conexion Establecida");
            }
        }catch (ClassNotFoundException | SQLException e){            
            System.out.println("ERROR MARIELA " +e);
        }
    }
    
    //Este método retorna la conexion de la BD
    public Connection getConexion() {
        return conexion;
    }
    
}
