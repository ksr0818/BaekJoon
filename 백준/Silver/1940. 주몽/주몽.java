import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i <N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int cnt = 0;
        int start = 0;
        int end = N-1;

        while (start < end) {
            if (A[start] + A[end] < M) {
                start++;
            }
            else if (A[start] + A[end] > M) {
                end--;
            }
            else {
                cnt++;
                start++;
                end--;
            }
        }
        System.out.println(cnt);
    }
}
