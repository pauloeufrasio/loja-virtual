import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {
    public static void main(String[] args)  throws SQLException {

        // conexao banco de dados
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/loja_virtual?usetimezone=true&serverTimezone=UTC","root","05853280Pa@");
        System.out.println("Fechando conexão ");
        connection.close();
    }
}
