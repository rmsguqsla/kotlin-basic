package condition

import java.util.*

fun main() {
    val sc : Scanner = Scanner(System.`in`)
    print("금액을 입력해 주세요: ")
    val price : Int = sc.nextInt()
    var finalPrice: Int = 0

    if (price >= 10000) {
        finalPrice = (price / 100) * 90
    } else {
        finalPrice = price
    }

    println("finalPrice = ${finalPrice}")
}