package lesson1.属性

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

class Boy{
    //?表示可空类型
    //1.声明变量时 不确定有没有值
    //2.接受Java的返回值
    var girlFriend:String?=null

    fun show(){
        //对于空类型的对象 调用时必须使用?
        println(girlFriend?.length)
        //明确指定这个对象一定不为空
        println(girlFriend!!.length)
    }
}

fun main() {
    //Boy().show()//会报错，因为girlfriend为空，但！！表示这个对象一定不为空，所以会报错

    val tt =MyClass.look()
    //如果这个对象为空 则后面不会执行
    //不为空就会执行对应方法
    println(tt?.length)

    val shape= Shape()
    //shape.password="1234"//因为set方法被私有化了，不能写了，所以外部改变不了password的值
    shape.name="triangle"//调用set方法
    println(shape.name)//调用get方法
}