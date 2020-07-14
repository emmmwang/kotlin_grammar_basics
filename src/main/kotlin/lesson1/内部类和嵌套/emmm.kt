package lesson1.内部类和嵌套

class Bank{
    var money= Money(0)

    //钱
    // 嵌套类 nested
    //独立  不能访问宿主类的属性个方法
    class Money(var num:Int)

    //银行卡
    //内部类 inner
    inner class  Card(){
        fun save(count:Int){
            money.num+=count
        }
        fun withDraw(count:Int){
            if(money.num>=count){
                money.num-=count
                println("取款成功，余额为￥${money.num}")
            }else{
                println("余额不足")
            }
        }
    }
}

fun main() {
    //Bank.Money(2)
    var card = Bank().Card()
    card.save(2)
    card.withDraw(1)


}