class Solution {
    public String solution(int n) {
        String answer = "";
        String str1 = "수박";
        String str2 = "수";
        
        if (n%2 ==0) return str1.repeat(n/2);
        else return str1.repeat(n/2) + str2;
    }
}