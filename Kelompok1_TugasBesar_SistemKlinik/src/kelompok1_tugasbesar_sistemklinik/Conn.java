package kelompok1_tugasbesar_sistemklinik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conn {
    private Connection connection;
    private Statement stmt;
    ResultSet rs;

    String url = "jdbc:mysql://localhost/klinik";
    String user = "root";
    String pass = "";

    public Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,pass);
            stmt = connection.createStatement();
        }catch(SQLException ex){
            System.err.print(ex);
        }catch(ClassNotFoundException ex){
            System.err.print(ex);
        } 
    }

    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "error :"
                    +e.getMessage(),"Communication Error : getdata",
                    JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query (String SQLString){
        try {
            stmt.execute(SQLString);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog
                    (null, "error"+e.getMessage(),
                            "Communication Error : query",
                            JOptionPane.WARNING_MESSAGE);
        }
    }

}
