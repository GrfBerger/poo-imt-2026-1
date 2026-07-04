package com.mycompany.testebd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    // getters/setters
    // get = metodo de consulta, retorna um atributo
    public int getCodigo(){
        return codigo;
    }
    // set = metodo de modificacao, atualiza o valor do atributo
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public void inserir(){
        //1: Definir o comando SQL
        String sql = 
                "insert into tb_pessoa(nome,fone,email) values (?,?,?)";
        //2: Estabelecer uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){     
            //3: Transformar a string em um comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preencher os placeholders (dados faltantes)
            ps.setString(1, nome);
            // ps.setInt(2,idade);
            ps.setString(2, fone);
            ps.setString(3, email);
            //5: Executa o comando  
            ps.execute();
        }catch(SQLException e){     
        }   
    }
    
    public void atualizar(){
        //1: Definir o comando SQL
        String sql = 
        "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            //5: Executa o comando
            ps.execute();
        }catch(SQLException e){    
        }
    }
    
    public void apagar(){
        //1 - Definimos o comando SQL em string
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        //2- Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
                //3- Pré compila o comando
                PreparedStatement ps = c.prepareStatement(sql);
                //4- Preenche os dados faltantes
                ps.setInt(1, codigo);
                //5- Executa o comando
                ps.execute();
        }catch(SQLException e){    
        }
    }
    
    public void listar(){
        //1: Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";
        
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda
            //o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            
            //5: itera sobre o resultado
            while (rs.next()){ //next() verifica se existe uma próxima linha
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");  
                String aux = String.format(
                    "Código: %d, Nome: %s, Fone: %s, Email: %s",
                    codigo,
                    nome,
                    fone,
                    email
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        }catch(SQLException e){    
        }
    }
}
