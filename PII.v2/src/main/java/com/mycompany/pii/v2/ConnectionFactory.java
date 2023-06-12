package com.mycompany.pii.v2;

import java.sql.*;

public class ConnectionFactory {
    private static String host = "ep-fragrant-leaf-262890.eu-central-1.aws.neon.tech";
    private static String porta = "5432";
    private static String db = "neondb";
    private static String usuario = "servilieri";
    private static String senha = "CvOVjIyQc5U7";
    
    public static Connection obterConexao ()throws Exception{
        String s = String.format("jdbc:postgresql://%s:%s/%s", host,porta, db);
        //cláusula catch or declare
        return DriverManager.getConnection(s, usuario, senha);
    }
    public static void main(String [] args)throws Exception{
        obterConexao();
    }
}