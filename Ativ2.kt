// 2 Crie uma array de planetas que inclua
// "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"
// e, em seguida, peça ao usuário para digitar o nome de um planeta.
//Verifique se o planeta que o usuário informou está na array e informe ao usuário.

fun main(){
    val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    print("Digite o nome de um planeta: ")
    val planUsuario = readln()
    if (planUsuario != null && planetas.contains(planUsuario)){
        println("$planUsuario está na lista de planetas.")
    }
    else{
        println("$planUsuario não está na lista de planetas.")
    }
}