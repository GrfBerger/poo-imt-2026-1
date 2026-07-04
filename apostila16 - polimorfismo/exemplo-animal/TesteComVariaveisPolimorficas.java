public class TesteComVariaveisPolimorficas {
    public static void main(String[] args){
        Animal a1 = new Gato(); // animal a1 é um gato
        Animal a2 = new Cachorro(); // animal a2 é um cachorro
        a1.fazerBarulho();
        a2.fazerBarulho();
    }
}
