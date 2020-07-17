package lesson1.抽象类

//抽象类
//一个界面Activity->加载->显示->结束
///一个app有多个界面
//抽象成一个模板
//抽取基类 base类 LoginActivity BaseActivity
/*
抽象类里面可以定义
  抽象属性
  抽象描述
  抽象方法
  普通方法->有实现

  抽象方法不能实现，抽象属性不能初始化
  如果子类必须实现，呢么就定义为抽象方法 否则就定义为普通方法

  抽象类默认是open的
  如果要重写抽象类的普通方法，必须要用open来修饰该方法
 */

abstract class BaseActivity{
    abstract var title:String
    init{
        //创建界面
        onCreate()
        //暂停界面
        onPause()
        //销毁界面
        onDestory()
    }

    abstract fun onCreate()

    open fun onPause(){

    }

    open fun onDestory(){

    }
}