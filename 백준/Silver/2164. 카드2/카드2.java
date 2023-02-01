import java.util.*;

public class Main {
    public static void main(String[] args) {
        //scanner 설정
        Scanner sc = new Scanner(System.in);
        
        // 카드 개수를 scanner를 통해 받기
        int input = sc.nextInt();
        
        //Queue 생성
        Queue<Integer> queue = new LinkedList<>();
        
        // for를 통해 queue에 카드 생성 1~input까지
        for (int i=1; i<=input; i++) {
            queue.add(i);
        }
        
        
        // queue size가 1이 될 때 까지 버리고 맨아래 추가하기를 반복!
        while(queue.size()>1) {
            queue.poll();
            queue.add(queue.peek());
            queue.poll();
        }
        
        // queue size가 1일 때 그 값을 프린트
        System.out.println(queue.peek());
    }
}
