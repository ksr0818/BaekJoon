import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] B = new int[n];

        String[] strArr = br.readLine().split(" ");
        for (int i=0; i < n; i++) {
            A[i] = Integer.parseInt(strArr[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i =1; i < n; i++) {
            while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
                B[stack.pop()] = A[i];
            }
            stack.push((i));
        }
        while (!stack.empty()) {
            B[stack.pop()] = -1;
        }
        for (int i =0; i<n; i++) {
           bw.write(B[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
