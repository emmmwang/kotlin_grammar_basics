package 函数

//Unit==void
fun buy(money:Int):Unit{

}

fun study(money:Int):Int{
    //
    return  0
}

/*fun add(a:Int,b:Int):Int{
    return a+b
}*/

fun add(a:Int,b:Int)=a+b

fun work(money:Int=6000,name:String,type:String="android"){

}

//vararg表示可变参数，可以传多个参数（同类型）
fun add(vararg names:Int){
    var result=0
    for(value in names){
        result+=value
    }
    println(result)
}

//local function
fun showView(){
    fun loadData()="图片"
    fun showList(){
        //下载数据
        //also的作用就是loadData()有个返回值，如果你现在就想用这个返回值，
        //就可以用also
        loadData().also {
            println("显示下载的内容：$it") }
    }
    showList()
}

/*
fun showView(){
    fun loadData()="图片"
    fun showList(){
        //下载数据
        var img= loadData()
        //展示
        println("显示下载的内容：$img")
    }
    showList()
}
*/


fun main() {
    work(8888,"emmm")
    work(name="jack")
    add(1,2,3,4)
    showView()
}
