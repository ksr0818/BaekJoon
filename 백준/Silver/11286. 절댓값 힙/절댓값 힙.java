import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int A = Math.abs(o1);
            int B = Math.abs(o2);
            if (A == B) return o1 > o2 ? 1 : -1;
            else return A - B;
        });

        for (int i =0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num ==0) {
                if (queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            }
            else queue.add(num);
        }
    }
}
