import java.util.Scanner;

/**
 * Created by Cynric on 8/3/16.
 */
public class Test1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.matches("[0-9]+")) {
                boolean output = true;
                int num = Integer.parseInt(line);
                String[] input = new String[num];

                for (int i = 0; i < num; i++) {
                    input[i] = scanner.nextLine();
                    if (i > 0 && input[i].charAt(0) != input[i - 1].charAt(input[i - 1].length() - 1)) {
                        output = false;
                    }
                }

                if (output) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }


            } else {
                System.out.println("input error");
            }
        }
    }

}
