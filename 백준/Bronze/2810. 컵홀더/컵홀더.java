import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String result = "";
        int count=1;

        String input = sc.nextLine();
        for (int i=0; i< num; ) {
            char ch = input.charAt(i);
            if (ch == 'S') {
                result = result + "*" + 'S' + "*";
                i=i+1;

            }
            else if (ch == 'L') {
                result = result + "*" + "LL" + "*";
                i= i+2;

            }
        }
        result = result.replace("**","*");

        int Len1 =result.length();
        int Len2 = result.replace("*","").length();

        System.out.println(Math.min(Len1-Len2,num));


        sc.close();

    }
}
