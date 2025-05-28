package combo.principal;

import combo.bo.BoConexao;
import combo.dao.DaoConectarBD;
import combo.modelo.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

public class Principal {
    private Connection conexao;
    private BoConexao boConexao;
    private DaoConectarBD daoConectarBD;

    public Principal() {
        boConexao = new BoConexao();
        daoConectarBD = new DaoConectarBD();
    }

    public void conectar() {
        try {
            Conexao conexaoModel = new Conexao();
            conexaoModel.setHost("localhost");
            conexaoModel.setPorta("5432");
            conexaoModel.setBanco("livros");
            conexaoModel.setUsuario("postgres");
            conexaoModel.setSenha("root");

            if (boConexao.validarConexao(conexaoModel)) {
                conexao = daoConectarBD.conectar(conexaoModel);
                if (conexao != null) {
                    System.out.println("Conexão estabelecida com sucesso!");
                } else {
                    System.out.println("Falha ao estabelecer conexão.");
                }
            } else {
                System.out.println("Dados de conexão inválidos.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão encerrada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.conectar();
        // Aqui você pode adicionar mais operações com o banco de dados
        principal.desconectar();
    }
} 