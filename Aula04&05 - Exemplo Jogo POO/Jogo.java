import javax.swing.JOptionPane;

public class Jogo {
    // método main = é o ponto partida do projeto
    public static void main(String[] args) { // assinatura do método main

        String nome = JOptionPane.showInputDialog("Digite o nome do personagem: ");

        // cria o personagem já com um nome
        Personagem cacador = new Personagem(nome); // energia = 10, sono, fome e experiencia = 0


        int escolha = Integer.parseInt(
            JOptionPane.showInputDialog("1- Cacar \n 2- Comer \n 3- Dormir \n 4- Sair")
        );

        while(escolha != 4){ // se escolha é diferente de 4, o laço continua

            if(escolha == 1){  // se escolha é igual a 1
                cacador.cacar();
            }else if(escolha == 2){ // se escolha != 1 e ao mesmo escolha == 2
                cacador.comer();
            }else if(escolha == 3){ // se escolha != 2 e ao mesmo escolha == 3
                cacador.dormir();
            }else{
                System.out.println("Digite uma opcao valida!!");
            }

            if(cacador.getExperiencia() == 10){
                //System.out.println("Parabéns!! Você VENCEU!!");
                JOptionPane.showMessageDialog(null, "Parabéns!! Você VENCEU!!");
                break;
            }

            if(cacador.energia == 0 || cacador.sono == 10 || cacador.fome == 10){
                //System.out.println("Você FALECEU!!");
                JOptionPane.showMessageDialog(null, "Você FALECEU!!");
                break;
            }

            escolha = Integer.parseInt(
                JOptionPane.showInputDialog("1- Cacar \n 2- Comer \n 3- Dormir \n 4- Sair")
            );
        }

    }
}
