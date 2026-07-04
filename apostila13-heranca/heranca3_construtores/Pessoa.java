public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construindo Pessoa...");
    }

    //getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}