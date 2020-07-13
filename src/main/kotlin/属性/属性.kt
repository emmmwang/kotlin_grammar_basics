package 属性

//封装 继承 多态
//属性 和方法->整体
//默认定义属性时会自动创建对应的set或get方法
//val 常量属性 只有get
//var 变量属性  get/set
//kotlin类的属性声明的同时必须有初值 初始化
//可以重写默认的set/get方法

//默认情况下任何一个属性都有一个内部变量名字是field
//这个变量只能在初始化的时候调用  set/get
class Shape(){
    var name:String="triangle"//定义的时候直接给值
    set(value){ field=value.toUpperCase()}//把value转成大写
    get()=field.toLowerCase()

    //设置外部访问 只读（不能设置为val 应为val后内部也不能访问了
    var password:String="1234"
        private set    //
}

fun main() {
    val shape=Shape()
    shape.password="1234"//因为set方法被私有化了，不能写了，所以外部改变不了password的值
    shape.name="triangle"//调用set方法
    println(shape.name)//调用get方法
}