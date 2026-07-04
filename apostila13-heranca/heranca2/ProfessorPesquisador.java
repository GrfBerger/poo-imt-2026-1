// ProfessorPesquisador herda matricula diretamente de Professor
// herda nome e idade indiretamente de Pessoa
// Tem então um total de 3 atributos: nome, idade e matricula
// Tem um comportamento próprio: método pesquisar()
public class ProfessorPesquisador extends Professor{

    public void pesquisar(){
        System.out.println("Pesquisando..");
    }
}