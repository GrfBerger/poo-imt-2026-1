// encapsulamento = atributos privados e com get/set

public class Carro{
    private String marca;
    private int velocidade;

    // método costrutor = define como um objeto de uma classe será construído
    // queremos criar objetos da classe carro já com valores iniciais para os atributos
    public Carro(int velocidadeInicial, String marcaInicial){
        marca = marcaInicial;
        velocidade = velocidadeInicial;
    }
    
    // 1º comportamento escolhido
    public void acelerar(int acrescimo){
        velocidade += acrescimo; //velocidade = velocidade + acrescimo;
    }

    // exercico: façam o método desacelerar()
    // 2º comportamento escolhido
    public void desacelerar(int decrescimo){
        velocidade -= decrescimo; // velocidade = velocidade - decrescimo
    }
    
    
    // getters = retorna o valor do atributo
    public String getMarca(){
        return marca;
    }
    public int getVelocidade(){
        return velocidade;
    }
    // setters = atualizar o valor do atributo
    public void setMarca(String novaMarca){
        marca = novaMarca;
    }
    public void setVelocidade(int novaVelocidade){
        velocidade = novaVelocidade;
    }
}