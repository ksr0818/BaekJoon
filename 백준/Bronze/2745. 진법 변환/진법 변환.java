import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = sc.nextInt();
        int temp = 1;
        int result = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);

            if('A'<= c && c <= 'Z') {
                result += (c-'A'+10)*temp;
            }else {
                result += (c-'0')*temp;
            }
            temp *= N;
        }

        System.out.println(result);

    }
}