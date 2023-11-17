import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        // 10진법 -> 3진법
        while(n != 0) {
            list.add(n%3);
            n /= 3;
        } 
        // 3진법 -> 10진법
        int num = 1;
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i)*num;
            num *= 3;
        }
        return answer;
    }
} 