package condition

import java.util.Scanner

fun main() {
    val sc : Scanner = Scanner(System.`in`)
    print("학점을 입력해 주세요: ")
    val score : Int = sc.nextInt()

//    if (score >= 90) {
//        println("A 학점입니다.")
//    } else if (score >= 80) {
//        println("B 학점입니다.")
//    } else if (score >= 70) {
//        println("C 학점입니다.")
//    } else if (score >= 60) {
//        println("D 학점입니다.")
//    } else {
//        println("F 학점입니다.")
//    }

    val result = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }
    println("${result} 학점입니다.")
}