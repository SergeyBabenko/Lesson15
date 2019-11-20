fun main() {
    val name = listOf("Хрюша", "Степаша", "Филя", "Гуля").first { it.length > 6 }
    println(name)
}