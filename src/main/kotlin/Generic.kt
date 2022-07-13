fun main() {

}

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }
    }
    return (soma / notas.size)
}