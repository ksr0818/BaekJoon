import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i=0; i < nums.length; i++) {
            hashmap.put(nums[i],i);
        }
        if (hashmap.size() > nums.length /2) answer = nums.length /2;
        else answer = hashmap.size();
        
        
        return answer;
    }
}