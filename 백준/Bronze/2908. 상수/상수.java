import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] strArr = input.split(" ");
        for (int i=0; i < 2; i++) {
            StringBuffer sb = new StringBuffer(strArr[i]);
            strArr[i] = sb.reverse().toString();
        }

        System.out.println(Math.max(
                Integer.parseInt(strArr[0]),
                Integer.parseInt(strArr[1])));
    }
}
