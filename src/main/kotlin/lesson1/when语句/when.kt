package lesson1.when语句

fun main() {
    var num=11

    //更简洁
    when(num){
        10->println("10")
        30-> println("30")
        40-> println("40")
        else-> println("其他")
    }

    //更灵活
     when(num){
        in 1..10-> println("z")
        in 11..59-> println("E")
        in 60..79-> println("f")
        else-> println("没有成绩")
    }

    //更方便
    val result=when(num) {
        10->"a"
        11->"b"
        12->"c"
        else->"其他"
    }
    println("result is $result")

}