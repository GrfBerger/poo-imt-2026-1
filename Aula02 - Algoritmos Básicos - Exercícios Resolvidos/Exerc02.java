// 2. Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado.

import javax.swing.JOptionPane;

public class Exerc02{
  public static void main(String[] args){
        // Ler os 4 números
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2: "));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 3: "));
        double numero4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 4: "));
        
        // Soma o quadrado dos 4 números
        double somaQuadrados = numero1*numero1 + numero2*numero2 + numero3*numero3 + numero4*numero4;
        
        // Mostrar o resultado
        JOptionPane.showMessageDialog(null, somaQuadrados);
  }
}
