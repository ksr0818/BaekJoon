import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 설정
        Scanner sc = new Scanner(System.in);

        // queue 2개 지정 (queue : 살아남은 사람 / result : 탈락한 사람)
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        // 인원 N 및 반복되는 수 K 받기
        int N = sc.nextInt();
        int K = sc.nextInt();

        // queue에 1~N까지 넣어주기
        for (int i = 1; i <=N; i++ ) {
            queue.add(i);
        }

        // queue 사이즈가 0이 될 때 까지 K 번째 사람을 제거
        while(queue.size() >0) {
            for (int i=0; i<K; i++) {
                // K 번째 마다 result에 저장 후 queue에서 삭제
                if (i == K-1) result.add(queue.poll());

                // K 번재 이전에는 첫번 째 수 가장 뒤로 보내기
                else queue.add(queue.poll());
            }
        }

        // 출력 형식을 맞추기 위해 queue를 String으로 변환
        String str = String.valueOf(result);

        // [ ] (대괄호) 를 <> (꺽새)로 변환하여 출력
        System.out.println(
                str.replace("[","<")
                   .replace("]",">")
        );
    }
}
