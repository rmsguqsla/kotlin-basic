package condition

fun main() {

    val dust: Int = 30

    // if 문을 통해 변수 할당
//    val result = if (dust <= 35) {
//        "놀 수 있다."
//    } else {
//        "집에서 논다."
//    }

    // when 문을 통해 변수 할당
    val result = when(dust) {
        in 0..35 -> {
            "놀 수 있다."
        }
        else -> {
            "집에서 논다."
        }
    }

    println("result = ${result}")
}