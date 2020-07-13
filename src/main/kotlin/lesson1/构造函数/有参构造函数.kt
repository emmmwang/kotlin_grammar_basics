package lesson1.构造函数

import java.awt.Color

fun main() {
    var zs= Student("张三")
    println(zs.name)
    println(zs.wife)

    //带参数的名字
    //想给哪个参数赋值就在括号内写哪个参数(kotlin更新了，变量都要写，只能交换顺序）
    var emm=Student(wife = "rose",name = "")
}

class Student(var name:String,var wife:String=""){

}

//主构造函数带有参数
//参数是局部变量
//外部无法访问
//当对象初始化的方法里面可以访问
class Car(brand:String){
    val maBrand=brand
    init {
        println(brand)
    }

    constructor(brand:String,color: String):this(brand)
}