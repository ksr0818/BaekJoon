import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int num = start;
        int ten = 0;
        int one = 0;
        int sum = 0;
        int count =0;
        
        while(true) {
            ten = num / 10;
            one = num % 10;
            sum = ten + one;
            
            num = Integer.parseInt(String.valueOf(one)+String.valueOf(sum%10));
            
            count++;

            if (start == num) break;
        }

        System.out.println(count);
    }
}
