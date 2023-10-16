import java.util.*;

class Solution {
    boolean solution(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        s = s.toLowerCase();
        
        for (int i =0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else map.put(s.charAt(i), 1);
        }
        
        if (map.get('p') != map.get('y') ) return false;
        
        else if (map.containsKey('p') == false && map.containsKey('s')== false) return true;
        
        else return true;
    }
}