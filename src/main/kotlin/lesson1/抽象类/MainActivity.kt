package lesson1.抽象类

class MainActivity(override var title: String) : BaseActivity(){
    override fun onCreate() {
        println("主页面被创建了")
    }
}