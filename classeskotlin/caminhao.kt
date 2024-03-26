class Caminhao(
    nome: String,
    qtdeRodas: Int,
    marca: String,
    velocidade: Int,
    var qtdeCarga: Int
) : Automovel(nome,qtdeRodas,velocidade,marca) {
    override fun acelerar(){
        println("o caminhão esta acelerando!")
    }
    override fun frear(){
        println("o caminhão esta desacelerando!")
    }
    override fun toStr(){
        println("nome: "+nome+" | marca: "+marca+" | quantidade de rodas: "+qtdeRodas+" | velocidade: "+velocidade+" | quantidade de carga: "+qtdeCarga)
    }
}