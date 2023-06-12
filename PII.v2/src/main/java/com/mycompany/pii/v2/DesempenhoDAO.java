
package com.mycompany.pii.v2;
import java.util.List;
import java.util.ArrayList;
public class DesempenhoDAO {
    public ArrayList <Desempenho> obterDesempenho() throws Exception{
        
        ArrayList <Desempenho> desempenho = new ArrayList<>();
        String sql = "SELECT * FROM tb_desempenho_pii";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            
        
            try(var rs = ps.executeQuery()){
                while(rs.next()){
                // extrair os valores da linha atual 
                    String login = rs.getString("login");
                    int pontuacao = rs.getInt("pontuacao");
                //construo um obj hava
                    var des = new Desempenho(login, pontuacao);
                //adiciono na lista
                    desempenho.add(des);
                }
                return desempenho;
            }
        
            
        }
    }
    public void cadastrarDesempenho(Desempenho d)throws Exception{
        String sql = "INSERT INTO tb_desempenho_pii VALUES (?, ?)";
        try(var Conexao = ConnectionFactory.obterConexao();
                var ps = Conexao.prepareStatement(sql)){
            ps.setString(1, d.getLogin());
            ps.setFloat(2, d.getPontuacao());
            
            try(var rs = ps.executeQuery()){
            
            }
        }
    }
}
