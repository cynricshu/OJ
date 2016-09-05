import java.util.Arrays;

/**
 * Created by Cynric on 9/5/16.
 * http://www.nowcoder.com/test/question/72a99e28381a407991f2c96d8cb238ab?pid=734817&tid=4756724
 */
public class Bonus {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                new int[]{426, 306, 641, 372, 477, 409},
                new int[]{223, 172, 327, 586, 363, 553},
                new int[]{292, 645, 248, 316, 711, 295},
                new int[]{127, 192, 495, 208, 547, 175},
                new int[]{131, 448, 178, 264, 207, 676},
                new int[]{655, 407, 309, 358, 246, 714}
        };
        Bonus bonus = new Bonus();
        System.out.println(bonus.getMost(board));
    }

    public int getMost(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    sum[i][j] = board[i][j];
                } else if (i == 0 && j > 0) {
                    sum[i][j] = sum[i][j - 1] + board[i][j];
                } else if (i > 0 && j == 0) {
                    sum[i][j] = sum[i - 1][j] + board[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i - 1][j], sum[i][j - 1]) + board[i][j];
                }
            }
        }

        return sum[row - 1][col - 1];
    }
}
