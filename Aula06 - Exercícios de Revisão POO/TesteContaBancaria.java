public class TesteContaBancaria {
    
    public static void main(String[] args){

        // criamos duas novas contas utilizando o construtor
        ContaBancaria conta1 = new ContaBancaria("Maria", "123-4", 1000);
        ContaBancaria conta2 = new ContaBancaria("Joaquim", "567-8", 500);

        // realizamos a transferencia da conta 1 para a conta 2
        // conta1 = origem, conta2 = destino, valor = 200
        // conta1.saldo = 800, conta2.saldo = 700
        conta1.transferir(conta2, 200);

        conta1.consultarSaldo();
        conta2.consultarSaldo();
    }
}
