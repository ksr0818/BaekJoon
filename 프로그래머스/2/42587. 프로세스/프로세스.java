import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int idx = 200;
        
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i =0; i<priorities.length; i++){
            q.add(priorities[i]);
        }
        

        while(q.size()>0 && idx != location) {
            for (int i =0 ; i < priorities.length; i++) {
                if (priorities[i] == 0) continue;
                else {
                    if(priorities[i] == q.peek()) {
                        System.out.println(q.peek());
                        q.poll();
                        answer++;
                        idx = i;
                        if (i == location) break;
                        priorities[i] = 0;
                        
                    }
                }
            }
        }
        return answer;
    }
}