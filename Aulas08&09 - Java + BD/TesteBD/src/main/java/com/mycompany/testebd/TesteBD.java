package com.mycompany.testebd;

import javax.swing.JOptionPane;

public class TesteBD {

    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        
        do{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );
            switch(op){
                case 1:{
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    
                    Pessoa p = new Pessoa(nome,fone,email);
                    p.inserir();
                    break;
                }
                case 2: {
                    // atualizar
                    //1 - Pegamos os dados necessários com o usuário
                    String nome = JOptionPane.showInputDialog("Novo Nome?");
                    String fone = JOptionPane.showInputDialog("Novo Fone?");
                    String email = JOptionPane.showInputDialog("Novo Email?");
                    int codigo = Integer.parseInt(
                            JOptionPane.showInputDialog("Codigo?")
                    );
                    //2 - Configurar Pessoa de acordo com os dados do usuário
                    Pessoa p = new Pessoa(nome, fone, email);
                    p.setCodigo(codigo);
                    //3- Chama o método "atualizar()"
                    p.atualizar();
                    break;
                }
                case 3:{
                    // apagar
                    int codigo = Integer.parseInt(
                            JOptionPane.showInputDialog("Codigo?")
                    );
                    Pessoa p = new Pessoa();
                    p.setCodigo(codigo);
                    break;
                }
                case 4:
                    // listar
                    Pessoa p = new Pessoa();
                    p.listar();
                    break;
                case 0:
                    // sair
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        }while(op != 0);
    }
}
