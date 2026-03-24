import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
public class StudenDao {
    public ArrayList<Student> getStudentGioi() {
        Connection conn = SQL_connect.ketNoi();
        ArrayList<Student> StudentGioi = new ArrayList<>();
        String sql = "select * from Student where gpa >= 3.5";
        if (conn != null) {
            try (Statement st = conn.createStatement();
                 ResultSet rs = st.executeQuery(sql)
            ) {
                while(rs.next()) {
                    Student stu = new Student();
                    stu.setId(rs.getInt("id"));
                    stu.setName(rs.getString("name"));
                    stu.setMajor(rs.getString("major"));
                    stu.setGpa(rs.getDouble("gpa"));
                    StudentGioi.add(stu);
                }

            } catch (SQLException e) {
                System.out.println("loi ket noi");
                e.printStackTrace();
            }
        }
        return StudentGioi;
    }
}
