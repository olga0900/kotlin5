import kotlin.math.log

fun main(args: Array<String>) {
    println("Введите целое число: ")
    val n = readln().toIntOrNull()
    println("Целое основание:")
    val f = readln().toIntOrNull();

    if (f == 0) {
        if (n == 1) {
            println("0")
            return
        } else if (n == 0) {
            println("1")
            return
        }
    }

    if (n != null && f != null) {
        if (!log(n.toFloat(), f.toFloat()).rem(1).equals(0.0f)) {
            println("Подходящего целого числа нет..");
        } else {
            println(log(n.toFloat(), f.toFloat()).toInt())
        }
    } else {
        println("Ошибка во вводе чисел..")
    }
}