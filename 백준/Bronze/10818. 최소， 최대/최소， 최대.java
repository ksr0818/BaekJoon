import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numArr = new int[N];

        for (int i=0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }

        int max =-1000000;
        int min = 1000000;

        for (int i =0; i < N; i++) {
            max = Math.max(numArr[i],max);
            min = Math.min(numArr[i],min);
        }
        System.out.println(min + " " + max);
    }
}