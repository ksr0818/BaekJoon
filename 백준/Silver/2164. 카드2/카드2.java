import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=input; i++) {
            queue.add(i);
        }

        while(queue.size()>1) {
            queue.poll();
            queue.add(queue.peek());
            queue.poll();
        }

        System.out.println(queue.peek());
    }
}