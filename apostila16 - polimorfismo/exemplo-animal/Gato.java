// herda o método "fazerBarulho()" de Animal
public class Gato extends Animal {
    // sobrescrevemos um método herdado da classe mãe,
    // escrevendo um com a mesma assinatura na filha
    public void fazerBarulho(){
        System.out.println("miau");
    }
}
