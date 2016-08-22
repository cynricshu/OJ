/**
 * Created by Cynric on 8/12/16.
 */
public class Base {
    private String baseName = "base";
    {
        callName();
    }

    public Integer Base() {
        return 1;
    }
    public void callName() {
        System.out.println("father callname");
        System.out.println(baseName);
    }
    public static void main(String[] args) {
        Base b = new Base();
        Base b2 = new Sub2();
    }
}
class Sub2 extends Base {
    private String baseName = "sub2";
    public void callName() {
        System.out.println("sub2 callname");
        System.out.println(baseName);
    }
}

class Sub extends Base {
    private String baseName = "sub";
    public void callName() {
        System.out.println("sub callname");
        System.out.println(baseName);
    }
}
