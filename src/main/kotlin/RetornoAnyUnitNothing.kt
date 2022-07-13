fun main () {
    save()
}

/***
 * Any : aceita qualquer tipo basico
 * Unit : esta declarando que nã terá retorno
 */
fun valores(value: Any): Unit {}

/**
 * Nothing é um retorno provisorio pra por algum TODO dentro
 */
fun save(): Nothing {
    TODO("não tive tempo")
}