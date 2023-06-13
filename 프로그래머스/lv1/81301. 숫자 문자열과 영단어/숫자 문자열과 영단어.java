import java.util.*;
class Solution {
    public int solution(String s) {
        // 목표: s가 의미하는 원래 숫자를 return
        
        Map<String,String> engToNum = new HashMap<>();
        engToNum.put("zero","0");
        engToNum.put("one","1");
        engToNum.put("two","2");
        engToNum.put("three","3");
        engToNum.put("four","4");
        engToNum.put("five","5");
        engToNum.put("six","6");
        engToNum.put("seven","7");
        engToNum.put("eight","8");
        engToNum.put("nine","9");
        engToNum.put("ten","10");
        
        for (String eng : engToNum.keySet()) {
            s = s.replace(eng, engToNum.get(eng));
        }
        
        return Integer.parseInt(s);
    }
}