package lesson1.继承

//在已有类的基础上添加新的方法和属性
//1.继承
//2.函数扩展

//kotlin里面类默认不能被继承
open class  Father(var name:String,var age: Int=18) {
    //默认情况下 方法不能被重写 必须被open修饰
    open fun work(){
        println("干农活")
    }
}




//只能单继承,可以间接继承
class Child(name:String): Father(name, 18){
    fun show(){
        print("my name is $name age is $age")
    }

    //子类重写父类的方法 必须使用override修饰
    override fun work(){
        //如果子类需要调用父类的方法 使用super
        super.work()
        println("someone beloved")
    }
}

fun main() {
    Child("小王").work()
}
