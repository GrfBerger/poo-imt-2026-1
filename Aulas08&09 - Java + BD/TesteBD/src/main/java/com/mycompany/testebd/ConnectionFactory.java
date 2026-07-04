package com.mycompany.testebd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String usuario = "avnadmin";
    private String senha = "AVNS_Odc6vfMiX49Tj1rUn1s";
    private String host = "mysql-1cc06eed-poo-2026.k.aivencloud.com";
    private String porta = "27451";
    private String bd = "db_pessoas";
    
    public Connection obtemConexao(){
        try{
            // estabelecer conexao
            Connection c = DriverManager.getConnection(
                  //"jdbc:mysql://localhost:3306/db_pessoas
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                    usuario,
                    senha
            );       
            return c;
        }catch(SQLException e){
            return null;
        }
    }       
}
