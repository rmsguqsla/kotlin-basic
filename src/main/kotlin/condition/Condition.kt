package condition


fun main() {
    val dust: Int = 37

    if (dust <= 35) {
        println("밖에 놀러 나간다.")
    }
    if (dust > 30) {
        println("집에서 논다.")
    }

    if (dust <= 35) {
        println("밖에 놀러 나간다.")
    } else {
        println("집에서 논다.")
    }

    if (dust >= 0 && dust <= 15) {
        println("좋음")
    } else if (dust <= 35) {
        println("보통")
    } else if (dust <= 75) {
        println("나쁨")
    } else {
        println("매우나쁨")
    }
}