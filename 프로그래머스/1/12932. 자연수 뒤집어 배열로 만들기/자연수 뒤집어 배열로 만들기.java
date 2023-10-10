class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        int idx = 0;
        
        int[] answer = new int[str.length()];
        
        for (int i = str.length(); i > 0; i--) {
            answer[idx] = Integer.valueOf(str.substring(i-1,i));
            idx++;
        }
        
        return answer;
    }
}