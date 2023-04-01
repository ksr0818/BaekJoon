import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        int answer = 0;

        int fn = a1* n0 + a0;
        int cg = c*n0;

        if (c >= a1 && fn <= cg) {
            answer = 1;
            }

        System.out.println(answer);
        }
    }