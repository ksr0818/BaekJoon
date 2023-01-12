import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(factorial(N));

    }

    static int factorial(int num) {

        if(num <=1) return 1;
        return num * factorial(num-1);
    }
}