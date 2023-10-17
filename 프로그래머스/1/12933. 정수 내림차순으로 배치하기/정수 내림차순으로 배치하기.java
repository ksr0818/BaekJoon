import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // long to String
        String str = Long.toString(n);
        
        //String to charArray
        char[] charArr = str.toCharArray();
        
        //charArray 내림차순 정렬
        Arrays.sort(charArr);
        
        //StringBuilder를 이용, 내림차순 정렬
        StringBuilder sb = new StringBuilder(String.valueOf(charArr));
        sb.reverse();
        
        // String to Long
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}