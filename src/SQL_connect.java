import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SQL_connect {
    // Dùng static để có thể gọi trực tiếp từ Main mà không cần dùng lệnh new
    public static Connection ketNoi() {
        // java_connect_sql la tên database muốn kết nối
        String url = "jdbc:mysql://localhost:3306/java_connect_sql";
        String user = "root";
        String password = "23102006";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Tạo đường ống kết nối thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối rồi!");
            e.printStackTrace();
        }

        return connection; // Trả về đường ống này để nơi khác dùng
    }
}
