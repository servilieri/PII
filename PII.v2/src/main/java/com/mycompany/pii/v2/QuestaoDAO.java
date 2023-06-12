
package com.mycompany.pii.v2;
import java.sql.ResultSet;

public class QuestaoDAO {
    public Questao buscarQuestao(int numero)throws Exception{
        String sql = "SELECT * FROM tb_questao_pii WHERE numero = ?";
        
        try(var Conexao = ConnectionFactory.obterConexao();
                var ps = Conexao.prepareStatement(sql)){
                        
            ps.setInt(1, numero);
            
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    var questao = new Questao();
                    questao.setNumero(numero);
                    questao.setPergunta(rs.getString("pergunta"));
                    questao.setResposta(rs.getString("resposta"));
                    questao.setDica(rs.getString("dica"));
                    return questao;
                }
                
                
            }          
            
        }                
        catch(Exception e){
            e.printStackTrace();
            
            
        }
        return null;
    }    
}
