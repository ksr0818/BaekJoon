import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        int sum = 0;
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += ch-'0';
        }
        System.out.println(sum);

    }
}
