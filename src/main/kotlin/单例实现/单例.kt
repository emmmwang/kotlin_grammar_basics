package 单例实现

/**
        饿汉式
        懒汉式
 */

class Person private constructor(){
    companion object{
        val instance=Person()
    }
}

/**
 * 懒汉式
 */

class Sqlite private constructor(){
    companion object{
        var default:Sqlite?=null
        fun getInstance():Sqlite{
            if(default==null){
                synchronized(this) {
                    default= Sqlite()
                }

            }
            return default!!//（两个!!表示一定有）
        }

    }
    fun show(){
        println("王小王Y")
    }
}
fun main() {
    Sqlite.getInstance().show()
}