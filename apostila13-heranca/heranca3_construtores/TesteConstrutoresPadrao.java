public class TesteConstrutoresPadrao{
    public static void main(String[] args){
        Pessoa p = new Pessoa("Maria", 55);
        // Construindo Pessoa...
        Aluno a = new Aluno("Jose", 38);
        // Quando construimos a classe filha o construtor
        // da classe mae, tambem é chamado
        // Construindo Pessoa...
        // Construindo Aluno...
    }
}