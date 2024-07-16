package operator

fun main() {
    /**
     * 주어진 세 과목 점수의 평균
     */
//    val mathScore: Int = 78
//    val koreanScore: Int = 88
//    val englishScore: Int = 89
//    println((mathScore + koreanScore + englishScore) / 3)

    /**
     * 60점 미만이면 Fail, 셋 중 하나라도 Fail이면 Fail, Pass인지 Fail인지 출력
     */
    val mathScore: Int = 60
    val koreanScore: Int = 50
    val englishScore: Int = 90

    val mathPass: Boolean = mathScore >= 60
    val koreanPass: Boolean = koreanScore >= 60
    val englishPass: Boolean = englishScore >= 60

    val result = mathPass && koreanPass && englishPass
    println("result = ${result}")
}