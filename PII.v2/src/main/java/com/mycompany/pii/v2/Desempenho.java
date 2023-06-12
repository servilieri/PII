
package com.mycompany.pii.v2;

public class Desempenho {
    private String login;
    private float pontuacao;

    public Desempenho(String login, float pontuacao) {
        this.login = login;
        this.pontuacao = pontuacao;
    }

    public Desempenho() {
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
           
}
