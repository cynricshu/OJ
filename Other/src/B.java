/**
 * Created by Cynric on 8/12/16.
 */
public class B {
    public static B t1 = new B();
    public static B t2 = new B();

    static {
        System.out.println("静态块");
    }

    {
        System.out.println("构造块");
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        short a = 128;
        byte b = (byte) a;
        System.out.println(i + ~j);

        B t = new B();
    }
}