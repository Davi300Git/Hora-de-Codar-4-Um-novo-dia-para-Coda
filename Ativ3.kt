//3 Vamos criar uma lista de compras.
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
//Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no
// nosso mercado".
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

fun main(){
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Uva", "Morango")
    while (frutas.isNotEmpty()){
        print("Frutas disponíveis: $frutas")
        print("Digite o nome de um fruto para remover: ")
        val frutaComprada = readln()

        if (frutaComprada != null && frutas.contains(frutaComprada)){
            frutas.remove(frutaComprada)
            println("$frutaComprada foi retirada da lista.")
        }
        else{
            println("Fruta indisponivel na lista")
        }
    }
    println("Lista de compras finalizada.")
}