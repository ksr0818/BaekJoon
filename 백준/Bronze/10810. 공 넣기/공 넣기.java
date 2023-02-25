import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numArr = new int[N];

        int start =0;
        int end = 0;
        int num = 0;
        for (int i =0; i < M; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            num = sc.nextInt();

            for (int j = start-1; j < end; j++ ) {
                numArr[j] = num;
            }
        }

        for (int i=0; i < N; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}