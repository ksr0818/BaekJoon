import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numArr = new int[N];

        for(int i=0; i < N; i++) {
            numArr[i] = i+1;
        }

        for (int i=0; i < M; i++) {
            int first = sc.nextInt()-1;
            int second = sc.nextInt()-1;

            int num = numArr[first];
            numArr[first] = numArr[second];
            numArr[second] = num;

        }

        for (int i: numArr)
        System.out.print(i + " ");
    }
}