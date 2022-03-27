import java.sql.*;

public class Student_SQL {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/students";
        String username = "postgres";
        String password = "password";

        //Create connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to database!\n");

        //Create statement/query
        Statement stmt = con.createStatement();


        String s = "SELECT studentid, firstname, lastname, dateofbirth FROM STUDENTS";

        result(stmt, s);

        //Insert statement/query
        String i = "INSERT INTO STUDENTS VALUES(6,'Georgia','Staraki','06/01/1996')";

        //Execute statement/query
        stmt.execute(i);

        System.out.println("Insert done successfully!\n");
        result(stmt, i);


        //Update statement/query
        String u = "UPDATE STUDENTS SET FIRSTNAME='ARETI' WHERE STUDENTID=6";

        //Execute statement/query
        stmt.execute(u);


        System.out.println("Update done successfully!\n");

        result(stmt, u);


        //Delete statement/query
        String d = "DELETE FROM STUDENTS WHERE STUDENTID=6";

        //Execute statement/query
        stmt.execute(d);

        System.out.println("Deleted done successfully!\n");

        result(stmt, d);


        //Close connection
        con.close();

    }

    //Print table student
    public static void result(Statement stmt, String s) throws SQLException {
        //Execute statement/query
        ResultSet rs = stmt.executeQuery(s);

        while (rs.next()) {
            int studentid = rs.getInt("studentid");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String dateofbirth = rs.getString("dateofbirth");

            Student student = new Student(studentid, firstname, lastname, dateofbirth);
            System.out.println(student);
        }
        System.out.println("\n");

    }
}