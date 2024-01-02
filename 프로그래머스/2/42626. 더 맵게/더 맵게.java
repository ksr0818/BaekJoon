import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i =0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        while(queue.peek() < K) {
            if (queue.size() == 1) return -1;
            else if (!queue.isEmpty() && queue.peek() < K) {
                int mix = queue.poll();
                mix += queue.poll()*2;
                queue.add(mix);
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}