public class TesteLecionar{
    public static void main(String[] args){
        ProfessorHorista profHorista = new ProfessorHorista();
        ProfessorPesquisador profPesq = new ProfessorPesquisador();

        // acessando o atributo de forma direta
        profHorista.setNome("Maria"); 
        profPesq.setNome("Joao");

        profHorista.lecionar();
        profPesq.lecionar();
    }
}