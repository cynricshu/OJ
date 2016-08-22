
import java.util.Scanner;

public class Main {
    private static int num = 0;
    private static boolean find = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] element = line.split("\\s{1,}");

            int length = Integer.parseInt(element[0]);
            int target = Integer.parseInt(element[1]);

            line = scanner.nextLine();
            element = line.split("\\s{1,}");
            Integer[] source = new Integer[element.length];

            for (int i = 0; i < element.length; i++) {
                source[i] = Integer.parseInt(element[i]);
            }

            binSearch(source, 0, length - 1, target);
            System.out.print(num);
            num = 0;

        }


        // write your code here
    }

    public static void binSearch(Integer[] source, int startIndex, int lastIndex, int target) {
        if (startIndex <= lastIndex) {
            int middleIndex = partition(source, startIndex, lastIndex);
            int pivot = source[middleIndex];
            if (target < pivot) {
                binSearch(source, startIndex, middleIndex - 1, target);
            } else if (target >= pivot) {
                num += (middleIndex - startIndex + 1);
                if (target == pivot) {
                    find = true;
                } else {
                    binSearch(source, middleIndex + 1, lastIndex, target);
                }
            }
        } else {
            if (find == false) {
                num = -1;
            }
        }
    }

    public static int partition(Integer[] source, int startIndex, int lastIndex) {
        int middleIndex = (startIndex + lastIndex) / 2;
        int pivot = source[middleIndex];
        swapByIndex(source, startIndex, middleIndex);

        int currentIndex = startIndex;

        for (int i = startIndex + 1; i <= lastIndex; i++) {
            if (source[i] < pivot) {
                currentIndex++;
                swapByIndex(source, i, currentIndex);
            }
        }
        swapByIndex(source, startIndex, currentIndex);
        return currentIndex;
    }


    public static void swapByIndex(Integer[] source, int sourceIndex, int targetIndex) {
        int temp = source[sourceIndex];
        source[sourceIndex] = source[targetIndex];
        source[targetIndex] = temp;

    }
}
