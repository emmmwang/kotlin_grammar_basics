package lesson1.数据类

//数据模型
//MVP MVC MVVM model
//数据类 DataClass
//1.数据类的主构造函数必须至少有一个参数
//2.数据类的参数必须使用var或val修饰
//3.数据类不能使用open inner abstruct修饰
data class User(
    val name:String,
    val passWord:String,
    val id:Int){
}

fun main() {
    val u= User("emmmwang", "1243", 1).also {
        //只有一句话，用also简单点
        //默认提供set/get方法
        println(it)
    }

}