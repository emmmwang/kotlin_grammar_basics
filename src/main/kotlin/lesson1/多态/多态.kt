package lesson1.多态

open class Animal(){
    open fun sleep(){
        println("动物冬眠")
    }
}

class Dog(): Animal(){
    override fun sleep(){
        println("在家里面冬眠")
    }
}

fun whereToSleep(animal: Animal){
    animal.sleep()
}

//接口也是多态（大类型
interface OnClickListener{
    fun onClick()
}

class Button: OnClickListener {
    override fun onClick() {
        println("按钮被点击了")
    }
}

class Image: OnClickListener {
    override fun onClick() {
        println("图片被点击了")
    }
}

//统一接口
fun test(listener: OnClickListener){
    listener.onClick()
}

fun main() {
    val an= Animal()
    var dg= Dog()

    whereToSleep(dg)

    test(Image())
}