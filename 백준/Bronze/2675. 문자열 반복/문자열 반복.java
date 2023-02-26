import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i =0; i < num; i++) {
            String input = sc.nextLine();
            String[] strArr = input.split(" ");
            int repeat = Integer.parseInt(strArr[0]);
            String str = strArr[1];
            for (int j=0 ; j < str.length(); j++) {
                System.out.print(String.valueOf(str.charAt(j)).repeat(repeat));
            }
            System.out.println();
        }

    }
}
