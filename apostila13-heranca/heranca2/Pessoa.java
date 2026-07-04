public class Pessoa{
    // encapsulamento do atributo nome
    private String nome;
    int idade;

    // getter = método de acesso, que retorna o valor do atributo
    public String getNome(){
        return nome;
    }
    // setter = método de modificação, que atribui valor ao atributo
    public void setNome(String nome){
        this.nome = nome;
    }
}