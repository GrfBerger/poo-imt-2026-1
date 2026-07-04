// Aluno herda de Pessoa, os atributos nome e idade e seus getters/setters
public class Aluno extends Pessoa{

    public Aluno(String nome, int idade){
        super(nome, idade); // Pessoa(nome, idade)
        System.out.println("Construindo Aluno...");
    }
}