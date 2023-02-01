import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();


        for (int i = 1; i <=N; i++ ) {
            queue.add(i);
        }

        while(queue.size() >0) {
            for (int i=0; i<K; i++) {
                if (i == K-1) result.add(queue.poll());
                else queue.add(queue.poll());
            }
        }

        String str = String.valueOf(result);
        System.out.println(str.replace("[","<")
                .replace("]",">"));
    }
}