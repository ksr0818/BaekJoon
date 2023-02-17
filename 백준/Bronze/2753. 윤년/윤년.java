import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = 0;

        if (num %4 ==0 && num %100 !=0) result = 1;
        if (num % 400 ==0) result = 1;

        System.out.println(result);
        }
    }