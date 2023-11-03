import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split("");
        
        Arrays.sort(strArr,Collections.reverseOrder());
        
        for (String str : strArr) {
            answer += str;
        }
        return answer;
    }
}