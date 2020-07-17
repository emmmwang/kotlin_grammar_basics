package lesson1.抽象类

class LoginActivity(override var title: String) : BaseActivity() {
    override fun onCreate() {
        println("登录界面被创建了")
    }

    override fun onPause() {
        super.onPause()
        println("界面暂停了")
    }

    override fun onDestory() {
        super.onDestory()
        println("界面消失了")
    }
}