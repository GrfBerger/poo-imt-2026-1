public class TesteLivroDeNotas {
    
    // método main = ponto de partida da compilação
    public static void main(String[] args){
       
        // criando um objeto da classe LivroDeNotas
        LivroDeNotas livro1 = new LivroDeNotas();
        LivroDeNotas livro2 = new LivroDeNotas();
        
        // atribuir nomeDoCurso para o livro1, nomeDoCurso = "Historia"
        livro1.setNomeDoCurso("Historia");

        // atribuir nomeDoCurso para o livro2, nomeDoCurso = "Geografia"
        livro2.setNomeDoCurso("Geografia");

        livro1.setNomeDoCurso("Matematica");

        // método get = retorna o valor atual de um atributo
        System.out.println("O nome do curso do livro1 é: " + livro1.getNomeDoCurso());
        System.out.println("O nome do curso do livro2 é: " + livro2.getNomeDoCurso());

        livro1.exibirMensagem(); // "Bem vindo... do curso: Matematica"
        livro2.exibirMensagem(); // "Bem vindo... do curso: Geografia"
    }
}
