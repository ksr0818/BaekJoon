import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfData = sc.nextInt();
        int numOfQuestion = sc.nextInt();

        int[] data = new int[numOfData + 1];
        int[] sumOfData = new int[numOfData + 1];

        sumOfData[0] = 0;
        data[0] = 0;


        for (int i=1; i <=numOfData; i++) {
            data[i] = sc.nextInt();

            sumOfData[i] = sumOfData[i-1] + data[i];
        }

        for (int i=0; i < numOfQuestion; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(sumOfData[end] - sumOfData[start-1]);
        }
    }
}
