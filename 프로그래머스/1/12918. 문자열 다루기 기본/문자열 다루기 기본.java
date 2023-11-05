

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        if (s.length()!= 6 && s.length()!= 4) return false;

        for (int i =0; i < s.length(); i++) {
            if ((charArr[i] >= 48 && charArr[i] <= 57)== false) {
                answer = false;
                break;
            }
                
        }
        return answer;
    }
}