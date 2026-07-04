public class TesteCalculadora{

    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(10,8)); // 2 inteiros
        System.out.println(calc.soma(5.7,7.2)); // 2 doubles
        System.out.println(calc.soma("5","7")); // 2 Strings
        System.out.println(calc.soma(4,6,9)); // 3 inteiros
    }
}