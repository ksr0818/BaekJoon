class Solution {
    public int[] solution(String s) {
        
        String replaceS = "";
        int cnt = 0;
        int length = 0;
        
        while(!s.equals("1")) {
            
            replaceS = s.replace("0","");
            length += s.length() - replaceS.length();
            s = replaceS;
             
            s = Integer.toBinaryString(s.length());
            cnt++;
            if (s.equals("1")) break;
        }
        
        int[] answer = {cnt,length};
        return answer;
    }
}