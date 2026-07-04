// 6. Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias.

import javax.swing.JOptionPane;

public class Exerc06 {
    public static void main(String[] args) {
        // Ler a idade em anos
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade em anos:"));
        
        // Transformar a idade em dias
        int idadeDias = idadeAnos * 365;

        JOptionPane.showMessageDialog(null, "A idade em dias é: " + idadeDias);
    }
}
