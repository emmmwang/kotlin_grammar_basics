public class MyClass {
    static final int SPRING=0;
    static final int SUMMER=1;

    public static void main(String[] args) {
        int a=10;
        double b=20.1;
        b=a;
        Test t=new Test();
    }

    public static String look(){
        return "null";
    }

    public static String getName(){
        return "西南大学";
    }
}

class person{
    String name;
    public void useTool(){

    }
}
class animal{
    String name;
    public  void sex(){

    }
}

class Test extends Object{
    String name;

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getName() {
        return name.toLowerCase();
    }
}





