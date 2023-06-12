package com.mycompany.pii.v2;

public class Questao {
    private int numero;
    private String pergunta;
    private String resposta;
    private String dica;


    public Questao(int numero, String pergunta, String resposta, String dica) {
        this.numero = numero;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.dica = dica;
    }

    public Questao() {
    }
    

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
}
