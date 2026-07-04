// Professor herda de pessoa, então possui 3 atributos no total:
// nome e idade herdados de Pessoa e matricula, que é próprio
public class Professor extends Pessoa{
    int matricula;

    public void lecionar(){
        System.out.println(getNome() + " lecionando...");
    }
}