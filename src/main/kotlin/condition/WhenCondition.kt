package condition

fun main() {
    val number: Int = 20

    when(number) {
        in 1..10 -> {
            println("1 ~ 10 입니다.")
        }
        20 -> {
            println("20 입니다.")
        }
        else -> {
            println("예상치 못한 값입니다.")
        }
    }
}