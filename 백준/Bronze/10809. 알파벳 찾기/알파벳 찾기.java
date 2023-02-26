import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i=0 ; i < alphabet.length(); i++) {
            System.out.print(str.indexOf(alphabet.charAt(i)) + " ");
        }
    }
}