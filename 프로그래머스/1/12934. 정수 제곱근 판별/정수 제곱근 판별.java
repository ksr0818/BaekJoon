import java.lang.Math.*;

class Solution {
    public long solution(long n) {
        
        long answer = -1;
        
        for (int i =0; i <= Math.sqrt(n) ; i++) {
            if (Math.pow(i,2) == n) {
                return (long) Math.pow((i+1),2);
            }
        }
        
        return answer;
    }
}