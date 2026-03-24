import java.rmi.StubNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        StudenDao studao = new StudenDao();
        System.out.println("DANH SACH SINH VIEN GIOI LA: ");
        ArrayList<Student> result = studao.getStudentGioi();
        for(Student x : result) {
            System.out.println("name: " + x.getName() + " | gpa: " + x.getGpa());
        }
    }
}
