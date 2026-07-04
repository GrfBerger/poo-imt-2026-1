// Indica que LivroDeNotas é uma classe
public class LivroDeNotas{
    // encapsulamento = deixar os atributos da classe privados (private)
    // atributo = característica do LivroDeNotas
    private String nomeDoCurso;

    // encapsulamento = todo atributo privado deve ter um método getter/setter
    // método get = retorna o valor do atributo
    public String getNomeDoCurso(){ // assinatura
        //corpo do método
        return nomeDoCurso;
    }
    
    // método set = atualizar o valor do atributo
    public void setNomeDoCurso(String novoNome){
        nomeDoCurso = novoNome;
    }

    // método = novo comportamento
    public void exibirMensagem(){
        // imprime uma mensagem de texto
        System.out.println("Bem vindo ao Livro de Notas do curso: " + nomeDoCurso);
    }
}