class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.substring(0,1) == "-") {
            answer = Integer.valueOf(s) * -1;
        }
        else answer = Integer.valueOf(s);
        return answer;
    }
}