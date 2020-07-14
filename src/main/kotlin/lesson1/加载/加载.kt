package lesson1.加载

//程序加载->加载数据->显示界面（一般加载）
//程序加载->显示界面
//       ->加载数据（懒加载）

class Activity{
    //懒加载只能修饰常量
    val data:String by lazy{
        "图片"
    }
    fun showActivity(){
        imgData="测试数据"
        println("显示下载的数据：$data")
    }

    //延迟加载（lateinit)
    //这个变量必须在某个时候初始化
    lateinit var imgData:String
}
fun main() {
    Activity().showActivity()
}