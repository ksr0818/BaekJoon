import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while(true) {
            if(num % 5==0) {
                count += num/5;
                break;
            }
            else {
                num -= 3;
                count++;
            }
            if (num <0) {
                count= -1;
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
