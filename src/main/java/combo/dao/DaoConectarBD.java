package combo.dao;

import combo.modelo.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConectarBD {
    public Connection conectar(Conexao conexao) {
        try {
            String url = String.format("jdbc:postgresql://%s:%s/%s",
                    conexao.getHost(),
                    conexao.getPorta(),
                    conexao.getBanco());
            
            return DriverManager.getConnection(url, conexao.getUsuario(), conexao.getSenha());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
} 