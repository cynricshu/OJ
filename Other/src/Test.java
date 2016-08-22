/**
 * Created by Cynric on 8/12/16.
 */
class Person {
    String name = "No name";

    public Person(String nm) {
        name = nm;
    }
}

class Employee extends Person {
    String empID = "0000";

    public Employee(String id) {
        super(id);
        empID = id;
    }
}

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + "" + y + "" + k);
    }
}