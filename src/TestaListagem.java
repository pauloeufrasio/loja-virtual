import java.sql.*;
import java.util.List;

public class TestaListagem {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/loja_virtual?usetimezone=true&serverTimezone=UTC",
                "root",
                "05853280Pa@");

        Statement stm = connection.createStatement();
        stm.execute("SELECT ID ,NOME ,DESCRICACAO FROM PRODUTO ");

        ResultSet rst = stm.getResultSet();

        // laco de listagem de produto do banco de dados
        while (rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println("Numero do produto: " +id);
            String nome = rst.getString("NOME");
            System.out.println("Produto: " +nome);
            String descricacao = rst.getString("DESCRICACAO");
            System.out.println("Descrição do produto: "+descricacao);
        }

        connection.close();
    }
}