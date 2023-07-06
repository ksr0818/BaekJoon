import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int count = 0;

        for (int i=0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for (int k=0; k < N; k++) {
            int num = A[k];
            int i = 0;
            int j = N-1;

            while(i < j) {
                if (A[i] + A[j] == num) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    }
                    else if(i == k) i++;

                    else j--;
                }

                else if (A[i] + A[j] < num) i++;
                
                else j--;
            }
        }
        System.out.println(count);
    }
}
