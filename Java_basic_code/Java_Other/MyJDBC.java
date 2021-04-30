import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        String url = "jbbc: mysql: //cosc304.ok.ubc.ca/workson";
        String uid = "rlawrenc";
        String pw = "todo";
    
        // NOte: Loading a driver class is not required
        // try {
        //     Class.forName("com.mysql.jdbc.Driver");
        // }

        // catch (java.lang.ClassNotfoundException e) {
        //     System.err.println("ClassNotFoundException: " + e);
        //     System.exit(1);
        // }
        try (Connection con = DriverManager.getConnection(url, uid, pw);
            Statement stmt = con.createStatement(); ) {

                ResultSet rst = stmt.executeQuery(
                    "SELECT eno, ename FROM emp" +
                    "WHERE eno IN (SELECT supereno FROM emp) ORDER BY ename"
                );

                while (rst.next()) {
                    System.out.println("Supervisor: " + rst.getString("ename"));

                    //Now look up employees directly supervised by this supevisor
                    Statement stmt2 = con.createStatement();

                    String sql = "SELECT ename, slary FROM emp WHERE supereno = '";
                    sql += rst.getString("eno") + "'ORDER BY salary DESC";
                    ResultSet rst2 = stmt2.executeQuery(sql);

                    while (rst2.next()) {
                        System.out.println("   " + rst2.getString(1) + ", " + rst2.getString(2));
                    }

                    System.out.println();
                }
            
        }
        catch(SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }
}