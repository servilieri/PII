
package com.mycompany.pii.v2;

public class AdministradorDAO {
    public boolean existe(Administrador adm) throws Exception{
        String sql = "SELECT cod, senha FROM tb_adm_pii WHERE cod = ? AND senha = ?";
        
        try(var Conexao = ConnectionFactory.obterConexao();
                var ps = Conexao.prepareStatement(sql)){
            ps.setInt(1, adm.getCodigo());
            ps.setString(2, adm.getSenha());
           
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
