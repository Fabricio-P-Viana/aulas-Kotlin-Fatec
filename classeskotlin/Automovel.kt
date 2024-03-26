open class Automovel {
    val nome: String
    val marca: String
    val qtdeRodas: Int
    val velocidade: Int
    constructor(nome: String, qtdeRodas: Int,velocidade: Int,marca: String) {
        this.nome = nome
        this.qtdeRodas = qtdeRodas
        this.velocidade = velocidade
        this.marca = marca
    }
    open fun acelerar(){
        println("o automovel esta acelerando!")
    }
    open fun frear(){
        println("o automovel esta desacelerando!")
    }
    open fun toStr(){
        println("nome: "+nome+" | marca: "+marca+" | quantidade de rodas: "+qtdeRodas+" | velocidade: "+velocidade)
    }
}

// problema 1 tentei instanciar uma classe pai com construtor com variaveis
// resoluçao na classe filha preciso pedir no construtor esses valores e passar para o construtor da super
