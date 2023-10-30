import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = 9999999;
        int idx = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i =0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        
        for (int i=0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                idx = i;
            }
        }
        
        list.remove(idx);
        
        if (list.size() == 0) return new int[]{-1};
        
        int[] answer = new int[list.size()];
        
        for (int i =0 ; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}