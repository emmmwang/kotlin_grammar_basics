package lesson1.伴生对象;

import sun.security.action.PutAllAction;

import java.security.PublicKey;

/**
 * 当Util类被调用-> 加载到内存Util->类对象Class->对象（属性和实例方法）
 */
public class Util {
    //静态方法(static)
    public static String URL="www.baidu.com";
    public static void loadDate() {
        System.out.println("下载图片");
    }
    //实例方法(无static) 必须是实例化这个类的对象 用这个对象来创建
    public void show(){

    }
}

    class Util1{
        Util instance=new Util();

        private Util1(){

        }
    }

