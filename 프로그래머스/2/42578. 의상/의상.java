import java.util.*;
class Solution {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();

        // 종류별 옷 종류가 몇 개인지 파악
        for(int i=0; i<clothes.length; i++){
            String cloth_type = clothes[i][1];
            hash.put(cloth_type, hash.getOrDefault(cloth_type, 1) + 1);
        }
        
        // 조합으로 문제 풀이
        for (String key : hash.keySet()) {
            answer *= hash.get(key);
        }
        
        // 최소 1개 조건으로 -1
        return answer -1;
    }
}