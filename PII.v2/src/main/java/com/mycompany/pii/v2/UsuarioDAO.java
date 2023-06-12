
package com.mycompany.pii.v2;

public class UsuarioDAO {
    
    public void cadastrar(Usuario u)throws Exception{
        String sql = "INSERT INTO tb_usuario_pii VALUES (?, ?, ?)";
        try(var Conexao = ConnectionFactory.obterConexao();
                var ps = Conexao.prepareStatement(sql)){
            
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getNome());
            ps.setString(3, u.getSenha());
            
            try(var rs = ps.executeQuery()){
                
            
            }
        }
    }
    
    public boolean existe(Usuario u)throws Exception{
        String sql = "SELECT login, senha FROM tb_usuario_pii WHERE login = ? AND senha = ?";
        
        try(var Conexao = ConnectionFactory.obterConexao();
                var ps = Conexao.prepareStatement(sql)){
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
           
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
