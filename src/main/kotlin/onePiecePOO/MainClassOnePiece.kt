package onePiecePOO

import java.text.DecimalFormat
import java.util.*

fun main() {
    ordenarPorOrdemRecompencaDecrescente()
    DecimalFormat("#,###.##")
}

fun ordenarPorOrdemRecompencaCrescente() {
    ListaPersonagens.sortBy { it.recompenca }
    ListaPersonagens.forEach { println(it) }
}

fun ordenarPorOrdemRecompencaDecrescente(){
    ListaPersonagens.sortByDescending { it.recompenca }
    ListaPersonagens.forEach { it.showCharacters() }
}

fun Personagem.showCharacters() {
    with(this){
        println("Nome: ${nome}\n" +
                "Raça: ${raca}\n" +
                "Função: ${funcao}\n" +
                "Recompença: ${recompenca.formatZero()}\n" +
                "________________________________________")
    }

}

fun personagensComAkumaNoMi(){}

fun nomesPersonagensDoMesmoBando(){}

fun recompensaDoBandoSomada(){}

fun Double.formatZero() = DecimalFormat("#,###.##").format(this)
