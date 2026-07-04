public class TesteSemVariaveisPolimorficas {
    
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        gato.fazerBarulho();
        cachorro.fazerBarulho();
    }
}
