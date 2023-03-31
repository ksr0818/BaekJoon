import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int len1 = sc.nextInt();
            int len2 = sc.nextInt();
            int len3 = sc.nextInt();

            if (len1 == 0 && len2 ==0 && len3 ==0) break;

            int max = 0;
            max = Math.max(max,len1);
            max = Math.max(max,len2);
            max = Math.max(max,len3);

            if (max < len1 + len2 + len3 - max) {
                if(len1 == len2 && len2 == len3) System.out.println("Equilateral");
                else if (len1 == len2 || len2 == len3 || len1 == len3) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }
            else System.out.println("Invalid");
        }
    }

}