package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {
    private Connection connection;

    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Método para criar a tabela no banco de dados
    public void criaTabela() {
        // Define a instrução SQL para criar a tabela MINHA_TABELA se não existir
        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql); // Executa a instrução SQL
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            // Captura exceções relacionadas a erros no banco de dados
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection); // Fecha a conexão
        }
    }
}