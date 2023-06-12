
package com.mycompany.pii.v2;

public class Usuario {
    private String login;
    private String nome;
    private String senha;

    public Usuario(String login, String nome, String senha) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String Login) {
        this.login = Login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }  
    
}
