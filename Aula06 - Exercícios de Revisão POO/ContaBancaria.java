public class ContaBancaria{
    // atributos
    String titular;
    String numero;
    double saldo;

    // construtor = método para inicializar os atributos da classe
    public ContaBancaria(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    // métodos
    public void depositar(double valor){ 
        if(valor >= 0)
            saldo += valor; // saldo = saldo + valor;
        else // valor < 0
            System.out.println("Digite um valor positivo.");  
    }

    public void sacar(double valor){
        //&& = AND 
        if(valor >= 0 && valor <= saldo)
            saldo -= valor; // saldo = saldo - valor;
        else
            System.out.println("Digite um valor valido.");
    }

    public void consultarSaldo(){
        // System.out.println("Titular: " + titular + " Numero: " + numero 
        // + " Saldo: " + saldo);
        // System.out.println("Saldo Formatado: " + String.format("%.2f", saldo));
        System.out.printf("Titular: %s Numero: %s Saldo: %.2f \n", titular, numero, 
        saldo);
    }

    public void exibirExtrato(){
        System.out.println("-------------------------------");
        // informacoes
        System.out.printf("Titular: %s Numero: %s Saldo: %.2f \n", titular, numero, 
        saldo);
        System.out.println("-------------------------------");
    }

    public void transferir(ContaBancaria destino, double valor){
        if(valor >= 0 && valor <= saldo){ // valor é válido
            // transferencia
            saldo -= valor; // subtrai valor do saldo na conta de origem (atual)
            destino.saldo += valor; // soma valor do saldo na conta de destino
        }else
            System.out.println("Digite um valor valido");
    }
}