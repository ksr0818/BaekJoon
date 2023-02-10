import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution(participant,completion));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String part : participant) {
            hm.put(part, hm.getOrDefault(part, 0) + 1);
        }
        for(String part : completion) {
            hm.put(part, hm.get(part) -1);
        }
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}