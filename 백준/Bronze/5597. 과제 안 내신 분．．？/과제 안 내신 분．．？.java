import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentArr = new int[30];

        for (int i =0; i <30; i++) {
            studentArr[i] = i+1;
        }

        for (int i =0; i < 28; i++) {
            int num =sc.nextInt();
            studentArr[num-1] =0;
        }

        for (int i=0; i <30; i++) {
            if (studentArr[i] != 0) {
                System.out.println(studentArr[i]);
            }
        }

    }
}