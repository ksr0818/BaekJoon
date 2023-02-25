import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[9];

        for (int i=0; i < 9; i++) {
            numArr[i] = sc.nextInt();
        }

        int max =0;
        int idx =0;

        for (int i =0; i < 9; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}