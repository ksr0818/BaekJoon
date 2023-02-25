import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[10];

        for (int i =0; i < 10; i++) {
            int num = sc.nextInt();
            numArr[i] = num%42;
        }

        int count =0;
        for (int i =0; i< 9; i++) {
            for (int j=i+1; j <10; j++) {
                if (numArr[i] == numArr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(10-count);
    }
}