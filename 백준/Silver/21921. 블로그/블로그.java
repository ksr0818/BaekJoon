import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] visitant = new int[N];

        for (int i = 0; i < N; i++) {
            visitant[i] = scanner.nextInt();
        }

        int end = 0;
        int sum = 0;
        int max = 0;
        int count = 1;

        for (int i = 0; i < N; i++){
            while ((end - i < X) && end < N){  // X일 만큼 범위 이동
                sum += visitant[end];
                end++;
            }

            if (max == sum){
                count++;
            }
            else if(max < sum){
                max = sum;
                count = 1;
            }

            sum -= visitant[i];
        }

        if (max == 0){
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(count);
    }
}