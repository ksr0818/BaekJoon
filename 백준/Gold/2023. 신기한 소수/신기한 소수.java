import java.util.Scanner;

public class Main {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int num1, int num2) {
        if (num2 == N) {
            if (isPrime(num1)) {
                System.out.println(num1);
            }
            return;
        }
        for (int i =1; i < 10; i++) {
            if (i%2==0) {
                continue;
            }
            if (isPrime(num1 * 10 + i)) {
                DFS(num1 * 10 + i, num2 +1);
            }
        }
    }

    static boolean isPrime (int num) {
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) {
                return false;
            }
        return true;
        }
}
