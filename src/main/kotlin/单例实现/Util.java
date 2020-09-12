package 单例实现;

import org.graalvm.compiler.nodes.NodeView;

//单例外部无法直接创建，只能通过方法来获取
public class Util {
    public static String Util="www.baidu.com";
    //静态方法
    public static void loadData(){
        System.out.println("下载图片");
        Util1.instance//只能在方法中获取！
    }
}

class Util1{
    //饿汉式
    public static Util instance=new Util();
    private Util1(){
        Util2.getInstance();
    }
}

class Util2{
    private static Util2 defatult;
    private Util2() {}
        public static Util2 getInstance(){
            if (defatult == null) {
                synchronized (Util2.class) {
                    if (defatult == null) {
                        defatult = new Util2();
                    }
                }
            }

            return defatult;
        }
    }