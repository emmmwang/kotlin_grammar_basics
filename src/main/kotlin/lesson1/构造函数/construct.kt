package lesson1.构造函数

fun main() {
    //实例化对象 直接调用构造函数
    val xw = Person2()
}

/**
 * kotlin里面构造函数分两种
 * 1.主构造函数 类的头部
 * 2.次构造函数 类的内部
 */

//默认提供一个没有参数的构造函数
class Person{

}

class Person1(){

}

//通过constructor关键字显式指明构造函数
//当有修饰的时候 constructor不能省略
class Person2 constructor(){
    init {
        println("init被调用")
    }
}

//提供一个次构造函数
//注意： 次构造函数必须显示调用主构造函数
class Person3(){
    constructor(name:String) : this() {

    }

    constructor(name:String ,age:Int ) : this(){

    }
}