import javax.swing.JOptionPane;

public class TesteCarro{
    
    public static void main(String[] args){
        // instaciar dois carros = criar dois objetos da classe Carro
         // construtor padrão do java, carro1.velocidade = 0 e carro1.marca = null
         // construtor programado por nós precisa de valores iniciais
        Carro carro1 = new Carro(100, "brasilia"); 
        Carro carro2 = new Carro(150, "fusca");

        // pedindo a velocidade do carro1
        int velocidade1 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a velocidade do carro1: ")
        );

        // pedindo a velocidade do carro2
        int velocidade2 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a velocidade do carro2: ")
        );

        // pedindo as marcas dos dois carros
        String marca1 = JOptionPane.showInputDialog("Digite a marca do carro1: ");
        String marca2 = JOptionPane.showInputDialog("Digite a marca do carro2: ");

        // atualizar os valores do carro1 usando os setters
        carro1.setMarca(marca1); // substitui o valor inicial ("brasilia") pela marca1
        carro1.setVelocidade(velocidade1);
        
        // atualizar os valores do carro2 usando os setters
        carro2.setMarca(marca2);
        carro2.setVelocidade(velocidade2);

        // 2.3 chamada para os métodos acelerar() e desacelerar()
        carro1.acelerar(20); // carro1.velocidade += 20; 50 + 20 = 70
        carro1.desacelerar(10); // carro1.velocidade -= 10; 70 - 10 = 60

        // print na linha do terminal
        // 2.4 mostramos as informações dos objetos utilizando os getters
        System.out.println("Informacoes Carro1: \n Velocidade: " 
            + carro1.getVelocidade() + " Marca: " + carro1.getMarca());
        
        System.out.println("Informacoes Carro2: \n Velocidade: " 
            + carro2.getVelocidade() + " Marca: " + carro2.getMarca());
    }
}