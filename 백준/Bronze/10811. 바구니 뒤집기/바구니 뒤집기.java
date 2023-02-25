import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int i=0; i< M; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;

            if(start > end) {
                while (start > end) {
                    int temp = basket[start];
                    basket[start] = basket[end];
                    basket[end] = temp;
                    start--;
                    end++;

                }
            }
            else if (start < end) {
                while (start < end) {
                    int temp = basket[start];
                    basket[start] = basket[end];
                    basket[end] = temp;
                    start++;
                    end--;
                }
            }
        }
        for (int num : basket)
        System.out.print(num + " ");
    }
}