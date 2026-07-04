// herda método "fazerBarulho()" de Animal
public class Cachorro extends Animal {

    // sobrescrevemos um método herdado da classe mãe,
    // escrevendo um com a mesma assinatura na filha
    public void fazerBarulho() {
        System.out.println("au au");
    }
}
