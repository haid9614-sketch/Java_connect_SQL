import java.sql.Connection;
public class Main {
    public static void main(String[] args) {
        System.out.println("Đang kiểm tra kết nối từ class Main...");

        // Gọi hàm ketNoi() từ class SQL_connect
        Connection myConn = SQL_connect.ketNoi();

        // Nếu myConn khác null nghĩa là kết nối thành công
        if (myConn != null) {
            System.out.println("Main đã nhận được kết nối! Sẵn sàng làm việc với DB.");
        }
    }
}
