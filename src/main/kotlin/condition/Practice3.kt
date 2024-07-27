package condition

import java.util.*

fun main() {
    val sc : Scanner = Scanner(System.`in`)
    print("금액을 입력해 주세요: ")
    val age : Int = sc.nextInt()
    var finalPrice: Int = 0

    if (age < 20) {
        finalPrice = (20000 / 100) * 70
    } else {
        finalPrice = 20000
    }

    println("finalPrice = ${finalPrice}")
}