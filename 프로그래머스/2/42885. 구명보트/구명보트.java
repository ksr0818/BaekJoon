import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        int start = 0;
        int end = people.length -1;
        
        // 작은 수로 정렬
        Arrays.sort(people);
        
        while(start <= end) {
            if (people[start] + people[end] > limit) {
                answer++;
                end--;
                
            }
            else {
                answer++;
                start++;
                end--;
            }
        }
        
        return answer;
        
        
    }
}