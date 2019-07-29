import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    Connection conn;
    public String Consulta;
    public Conector() {
                try{
            Class.forName("org.mariadb.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/animeflixbd","root","root");
        }
        catch(ClassNotFoundException exf){
            System.out.println("Error al registrar el driver de MySQL: " + exf);
        }
        catch(SQLException ex){
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
