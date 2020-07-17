package lesson1.匿名类

//接口->统一接口
//接口里面的函数默认是接口，默认是可以被继承的
//接口不能被实例化，只能实例化接口的实现类
interface  OnTouchListener{
    fun OnTouchEvent(type :String)
}

fun didTouch(listener: OnTouchListener){
    listener.OnTouchEvent("手指按下")
}

//方法1.定义类实现接口-> 实例化这个实现类
class ButtonListener: OnTouchListener {
    override fun OnTouchEvent(type: String) {
        println("接收事件为： $type")
    }
}

fun main() {
    //var btn= ButtonListener()
    //didTouch(btn)
    //ButtonListener().apply { didTouch(this)

     //ButtonListener().also { didTouch(it)

    //匿名类的方式实现(放在类的外部的）
    didTouch(object : OnTouchListener {
        override fun OnTouchEvent(type: String) {
            println("接收事件为： $type")
        }
    })
}

class QQQ{
    fun show(){
        dispatchTouch(object : OnTouchListener {
            override fun OnTouchEvent(type: String) {
                println("接收事件为： $type")
            }
        })
    }
    fun dispatchTouch(listener: OnTouchListener){
        listener.OnTouchEvent("手指在滑动")
    }

    class XXX : OnTouchListener {
        override fun OnTouchEvent(type: String){
            println("接收事件为： $type")
        }
    }
}



