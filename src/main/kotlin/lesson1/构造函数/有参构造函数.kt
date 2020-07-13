package lesson1.构造函数

import java.awt.Color

fun main() {
    var bz= Car("奔驰", "红色")

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