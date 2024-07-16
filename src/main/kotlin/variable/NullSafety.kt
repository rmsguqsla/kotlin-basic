package variable

fun main() {
    var name: String = "오근협"
//    name = null => Null can not be a value of a non-null type String

    var nullableName: String? = "오근협"
//    nullableName = null

//    name.length
//    nullableName.length => 컴파일에러

    // 1. 조건문을 통해 null 확인하기
    if (nullableName != null) {
        println(nullableName.length)
    }

    // 2. ?. 연산자를 통해서 안전하게 호출
    println(nullableName?.length)

    // 3. ?: 엘비스 연산자
    val length = nullableName?.length ?: 0
    println(length)

    // 4. !! => 얘는 null이 절대 아니야
    nullableName!!.length
}