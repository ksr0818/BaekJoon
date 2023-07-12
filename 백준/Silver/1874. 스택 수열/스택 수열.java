import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //push  + , pop - , 불가능 NO
        // 오름 차순 정렬! 숫자 중복 X
        // N 개수, 이후 N만큼의 int

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int[] A = new int[N];
        int num = 1;
        boolean result = true;

        for (int i =0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        for (int i =0; i< A.length; i++) {
            int n = A[i];
            if (n >= num) {
                while(n >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int m = stack.pop();
                if (m > n) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) System.out.println(sb);

        }

}
