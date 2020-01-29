package JRodriguez.sql;
import java.sql.*;


/**
 *
 * @author Analyst
 */
public class SqlHelper {
    
    private String pUsrConexion = null,  pPasConexion = null, URL = null, HOST = null, database = null;
  
    public static Connection conn = null;
    public static ResultSet resultquery;
    public static Statement statement;
    public static enum TypeManager {MySql,Sql};
    
    /**
     *
     * @param type
     * @param host
     * @param db
     * @param usr
     * @param pass
     */
    public SqlHelper(TypeManager type, String host, String db, String usr, String pass){
        
        try 
        {       
            if (host == null || host.equals(""))  
                throw new IllegalArgumentException("Debe existir un Host de Conexion"); else this.HOST = host;
            
            if (db == null || db.equals("")) 
                throw new IllegalArgumentException("Debe existir una base de datos valida"); else this.database = db;
            
            if (usr == null || usr.equals(""))  
                throw new IllegalArgumentException("Debe existir usuario de conexion valido"); else this.pUsrConexion = usr; 
            
            if (pass == null || pass.equals("")) 
                throw new IllegalArgumentException("Debe existir un password de conexion valido"); else this.pPasConexion = pass;
            
            if (type.equals(TypeManager.Sql)) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                URL =  "jdbc:sqlserver://"+ host +":1433;databaseName="+ db+ ";user="+pUsrConexion+";password=" + pPasConexion;
            }
            
            if (type.equals(TypeManager.MySql)) { 
                Class.forName("com.mysql.jdbc.Driver");
                URL =  "jdbc:mysql://"+ host +":3306/"+ db+ "?user="+pUsrConexion+"&password=" + pPasConexion;
            }           
                   
            conn = DriverManager.getConnection(URL);
            if (conn != null)
            {
                System.out.println("Conexión a base de datos "+ URL +" … Ok");
                statement = conn.createStatement();
            } else throw new NullPointerException("La URL de Conexion no puede ser nula");
            
            
        } catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos: " +ex.toString());
        } catch(ClassNotFoundException ez) {
            System.out.println("Clase No encontrada: " + ez);
        } 
    }
    
    public ResultSet ExecuteSQL(String sql) {
        try {
            statement = conn.createStatement();
            resultquery = statement.executeQuery(sql);            
            return resultquery;
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al ejecutar la sentencia sql" + ex.toString());
            return null;
        } 
    }

    
}
