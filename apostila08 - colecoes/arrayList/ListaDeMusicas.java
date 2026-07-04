// ArrayList = classe pronta do java que representa uma lista dinamica e generica:
// - dinamica: o tamanho cresce automaticamente conforme inserimos novos valores
// - generica: aceita tipos variados de dados em suas posições

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args){
        List <Musica> musicas = new ArrayList<>();
        int opcao;
        do{
            opcao = Integer.parseInt(
                JOptionPane.showInputDialog("0-Sair\n1-Inserir\n" +
                "2-Avaliar Música\n3-Ver Lista Ordenada\n")
            );
            switch(opcao){
                case 1:
                    // inserir
                    String musicaTitulo = JOptionPane.showInputDialog("Qual o nome da musica?");
                    musicas.add(new Musica(musicaTitulo)); // inserir novo elemento na arraylist
                    JOptionPane.showMessageDialog(null,"Musica inserida com sucesso!!");
                    break;
                case 2:
                    // avaliar musica
                    String titulo = JOptionPane.showInputDialog("Qual o nome da musica?"); 
                    int nota = Integer.parseInt(
                        JOptionPane.showInputDialog("Qual a nota da musica?")
                    );
                    // iteramos sobre a lista
                    // .size() = retorna o tamanho da lista
                    for(int i = 0; i < musicas.size(); i++){
                        // .get(i) = retorna a musica que esta no indice i
                        // .getTitulo() = retorna o titulo da musica retornada por .get(i)
                        // .equals() = vertifica se o titulo da musica retornada por .getTitulo()
                        // é igual ao digitado pelo usuário
                        if(musicas.get(i).getTitulo().equals(titulo)){
                            musicas.get(i).setAvaliacao(nota);
                            break;
                        }
                    }
                    break;
                case 3:
                    // ver lista ordenada
                    // nao cai na prova, conteudo de proximos semestres
                    break;
                case 0:
                    // sair
                    JOptionPane.showMessageDialog(null,"Até mais.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }while(opcao != 0);
    }
}
