class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        
        for (int i =1; i < food.length; i++) {
            if (food[i] % 2 == 1) food[i] = food[i] -1;
            for (int j = 0; j < food[i]/2; j++) {
                str = str + i;
            }    
        }
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
            
        answer = str + "0" + reversedStr;
        
        
        return answer;
    }
}