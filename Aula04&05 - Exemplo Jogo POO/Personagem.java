public class Personagem{
    // atributos
    String nome;
    int energia, fome, sono;
    private int experiencia; // experiencia esta encapsulada

    // método Construtor = serve para construir um novo objeto da classe
    // primeiro = cria o personagem com as condicoes ideais e sem nome
    public Personagem(){
        energia = 10;
        fome = 0;
        sono = 0;
        experiencia = 0;
    }

    // segundo = cria o personagem com as condicoes ideais e com nome
    public Personagem(String nomeEscolhido){
        nome = nomeEscolhido;
        energia = 10;
        fome = 0;
        sono = 0;
        experiencia = 0;
    }
    
    //método get = retorna o valor do atributo
    public int getExperiencia(){
        return experiencia;
    }

    //método set = atualizar o valor do atributo
    public void setExperiencia(int novaExperiencia){
        experiencia = novaExperiencia;
    }

    // métodos
    void cacar(){ // assinatura do método
        // corpo do método
        if(energia >= 2){
            System.out.println(nome + " esta cacando.");
            energia -= 2; // energia = energia - 2;
            experiencia++; // experiencia = experiencia + 1
        }else{  // energia < 2
            System.out.println(nome + " esta sem energia para caçar.");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        printAtributos();
    }

    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " esta dormindo.");
            sono--; // sono = sono - 1;
            energia = energia + 1 <= 10? energia + 1 : 10; // operador ternário
        }else{ // sono < 1
            System.out.println(nome + " já esta descansado e não pode dormir.");
        }
        printAtributos();
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " esta comendo.");
            energia = Math.min(energia + 1, 10);
            fome--; // fome = fome  - 1;
        }else{ // fome < 1
            System.out.println(nome + " esta sem fome.");
        }
        printAtributos();
    }

    // imprime o valor atual dos atributos
    public void printAtributos(){
        System.out.println("Energia: " + energia + " Fome: " + fome + " Sono: " + sono);
        System.out.println("Experiencia: " + experiencia);
    }
}