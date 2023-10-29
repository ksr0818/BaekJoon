import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int idx = 0;
        
        Arrays.sort(numbers);
        
        for (int i =0; i < 10; i++) {
            if(numbers[idx] == i) {
                if (idx == numbers.length-1) continue;
                else idx++;
            }
            else answer += i;
            
        }
        
        return answer;
    }
}