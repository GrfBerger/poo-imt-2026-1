public class Calculadora{
    public int soma(int a, int b){
        return a + b;
    }
    // 1ª sobrecarga do método de soma
    public double soma(double a, double b){
        return a + b;
    }
    // 2ª sobrecarga do método de soma
    public int soma(String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        return n1 + n2;
    }
    // 3ª sobrecarga do método de soma
    public int soma (int a, int b, int c) {
        return a + b + c;
    }
    // Critérios de diferenciação:
    // 1- quantidade de parâmetros é diferente
    // 1- tipo dos parâmetros são diferentes
    // 3- ordem dos parâmetros é diferente

    public int subtracao(int a, int b){
        return a - b;
    }
    public int multiplicacao(int a, int b){
        return a * b;
    }
    public int divisao(int a, int b){
        return a/b;
    }
}