package variable

fun main() {
    // var/val 변수명: 변수타입 = 초기화값
    var name: String = "오근협"
    var alive: Boolean = true;
    // val : 초기화 후 변경 불가 => 읽기만
    // var : 변경 가능 => 읽기, 쓰기

    // 예약어를 변수로 사용 시 ``사용
    var `in`: Int = 0

    // 초기화 안할 시 문제 생김
    var age: Int
    age = 10
    println("age = ${age}")

    // 정수형 (Integer types) : Byte, Short, Int, Long
    val one: Int = 1
    val threeBillion: Long = 3000000000
    val oneLong = 1L
    println("${oneLong::class.java}")
    val oneByte: Byte = 1
    val oneShort: Short = 1
    val threeBillionUnderBar: Long = 3_000_000_000

    // 실수형 (Float types) : Float, Double
    val pi: Double = 3.14
    val pi2 = 3.1415
    println("${pi2::class.java}")
    val f = 2.7182818f

    // Boolean true,false

    // String
    // 문자열 사이에 문자를 선언
    val result: String = "이름은 ${name}이고 나이는 ${age}입니다."
    println("result = ${result}")
}