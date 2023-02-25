import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] scores = new double[N];

        double max = 0;
        for (int i=0; i < N; i++) {
            double score = sc.nextDouble();
            max = Math.max(max,score);
            scores[i] = score;
        }

        double mean = 0;
        for (int i=0 ;i < N; i++ ) {
             mean += scores[i] / max * 100;
        }
        System.out.println(mean / N);
    }
}