/**
 * Created by Cynric on 8/11/16.
 */
public class Example {
    Integer str = new Integer(1);
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + "and");
        System.out.print(ex.ch);

    }

    public void change(Integer str, char ch[]) {
        str = new Integer(2);
        ch[0] = 'g';
    }
}