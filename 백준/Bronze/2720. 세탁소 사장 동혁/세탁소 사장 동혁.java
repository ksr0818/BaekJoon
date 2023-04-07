import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = 0;  //25
        int D = 0;  //10
        int N = 0;  //5
        int P = 0;  //1

        int num = sc.nextInt();

        for(int i =0; i < num; i++) {
            int money = sc.nextInt();

                if (money >= 25) {
                    Q = money / 25;
                    money -= 25 * Q;
                }

                if (money >= 10) {
                    D = money / 10;
                    money -= 10 * D;
                }

                if (money >= 5) {
                    N = money / 5;
                    money -= 5 * N;
                }

                if (money >= 1) {
                    P = money / 1;
                    money -= P;
                }

            System.out.printf("%d %d %d %d",Q,D,N,P);
            System.out.println();
            Q = 0;
            D = 0;
            N = 0;
            P = 0;

        }
    }
}
