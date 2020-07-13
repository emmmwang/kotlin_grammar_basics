package lesson1.for语句

fun main() {
    //使用..表示范围
    for(i in 1..10){
        //println("$i")
    }

    //使用until不包括最后一个值
    for(i in 1 until 10){
        //println("$i")
    }
    //使用step改变增量
    for(i in 1..10 step 3){
        //print("$i")
    }

    //使用downTo递减
    for(i in 10 downTo 1 step 2){
        //print("$i")
    }

    val names= arrayOf("jack","rose","merry")
    for(i in 0 until names.size){
        //println(names[i])
    }

    for(item in names){
        //println(item)
    }

    for(i in names.indices){
        //println(names[i])
    }

    for((index,item) in names.withIndex()){
        println("$index-$item")
    }
}