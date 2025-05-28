package combo.bo;

import combo.modelo.Conexao;

public class BoConexao {
    public boolean validarConexao(Conexao conexao) {
        if (conexao == null) {
            return false;
        }
        
        if (conexao.getHost() == null || conexao.getHost().trim().isEmpty()) {
            return false;
        }
        
        if (conexao.getPorta() == null || conexao.getPorta().trim().isEmpty()) {
            return false;
        }
        
        if (conexao.getBanco() == null || conexao.getBanco().trim().isEmpty()) {
            return false;
        }
        
        if (conexao.getUsuario() == null || conexao.getUsuario().trim().isEmpty()) {
            return false;
        }
        
        if (conexao.getSenha() == null || conexao.getSenha().trim().isEmpty()) {
            return false;
        }
        
        return true;
    }
} 