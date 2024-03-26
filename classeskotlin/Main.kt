fun main(){
    var carro = Automovel("siena",4,20,"fiat")
    carro.toStr()
    carro.acelerar()
    var caminhao = Caminhao("siena",4,"fiat",40,10)
    caminhao.toStr()
    caminhao.acelerar()
}

// o vscode não identifica arquivos no mesmo diretorio, utilizei o gdb para fazer deploy
