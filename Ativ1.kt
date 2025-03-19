fun main() {

    val estudantes = mutableListOf<String>()

    println("Cadastro de Estudantes")
    println("Digite o nome do estudantes ou 'PARE' para encerrar:")

    while(true){
        println("Nome do estudante: ")
        val nome = readln().trim()
        if(nome.uppercase() == "PARE"){
            break
        }
        estudantes.add(nome)
    }
    println("\nQuantidade de estudos cadastrados: ${estudantes.size}")
    if(estudantes.isNotEmpty()){
        println("Lista de estudantes:")
        for((indice, estudante) in estudantes.withIndex()){
            println("${indice + 1}. $estudante")
        }
    }
    else{
        println("Nenhum estudante foi cadastrado")
    }
}