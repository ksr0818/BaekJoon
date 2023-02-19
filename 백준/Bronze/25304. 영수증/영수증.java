import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();

        int sum = 0;
        int price = 0;
        int amount = 0;

        for (int i =0; i <num; i++) {
            price = sc.nextInt();
            amount = sc.nextInt();
            sum += price*amount;

        }
        if (sum== total) System.out.println("Yes");
        else System.out.println("No");
    }
}
