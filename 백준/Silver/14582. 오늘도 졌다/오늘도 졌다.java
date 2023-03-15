import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr1 = new int[9];
        int[] numArr2 = new int[9];

        int sum1 = 0;
        int sum2 = 0;

        boolean win = false;
        boolean reversal = false;


        for (int i=0; i< 9; i++) {
             numArr1[i] = sc.nextInt();
        }

        for (int i=0; i < 9; i++) {
            numArr2[i] = sc.nextInt();
            sum1 += numArr1[i];
            if (sum1 > sum2) {
                win = true;
            }
            sum2 += numArr2[i];
            if (sum1 > sum2) {
                win = true;
            }
        }
        if (sum1<sum2 && win) System.out.println("Yes");

        else System.out.println("No");
    }
}
