class Solution {
    public String solution(String phone_number) {
        
        String answer = "";
        int length = phone_number.length();
        
        answer = "*".repeat(length-4) + phone_number.substring(length-4,length);
        
        return answer;
    }
}