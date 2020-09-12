package lesson1.伴生对象

/**
        companion Object 伴生对象
        HttpRequest类->加载到内存类对象 Class（静态属性  静态方法）
 */
fun main() {
    //Util.URL
    //Util.loadDate()
    HttpRequest.url
    HttpRequest.loadData()
    ImageUtl.mo()

}

//替换java里面的工具类
//静态类
//都是静态属性  静态方法
object ImageUtl{
    fun scale(){

    }

    fun saveBitmapToFile(){

    }

    fun mo(){

    }
}

class HttpRequest{
    //val URL:String="http//www.baidu.com"
    companion object{
        var url:String="http//www.baidu.com"
        fun loadData(){
            println("下载数据")
        }
    }
}