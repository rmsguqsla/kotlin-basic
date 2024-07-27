package condition

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("1.VVIP / 2.VIP / 3.GOLD / 4.SILVER")
    print("고객 등급을 입력해주세요: ")
    val grade : Int = sc.nextInt()

    println("1.맥북(3,000,000) / 2.LG 그램(2,500,000) / 3.삼성 노트북(2,300,000)")
    print("구입 할 물픔을 입력해주세요: ")
    val product : Int = sc.nextInt()

    var finalPrice: Int = 0;

    if (grade == 1) {
        finalPrice = 70
    }
    if (grade == 2) {
        finalPrice = 85
    }
    if (grade == 3) {
        finalPrice = 90
    }
    if (grade == 4) {
        finalPrice = 100
    }

    if (product == 1) {
        finalPrice = 3000000 / 100 * finalPrice
    }
    if (product == 2) {
        finalPrice = 2500000 / 100 * finalPrice
    }
    if (product == 3) {
        finalPrice = 2300000 / 100 * finalPrice
    }

    println("finalPrice = ${finalPrice}")
}