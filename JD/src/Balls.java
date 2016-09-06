/**
 * Created by Cynric on 9/5/16.
 * http://www.nowcoder.com/question/next?pid=734817&qid=26020&tid=4758544
 */
public class Balls {
    public static void main(String[] args) {
        Balls balls = new Balls();
        System.out.println(balls.calcDistance(100, 90, 80, 70));
    }

    public int calcDistance(int A, int B, int C, int D) {
        return dis(A) + dis(B) + dis(C) + dis(D);

    }

    public int dis(int n) {
        double N = (float) n;
        double sum = 0;

        while (N > 0) {
            N = (N / 2);
            sum += N + N * 2;

        }
        return (int) Math.ceil(sum);
    }
}
