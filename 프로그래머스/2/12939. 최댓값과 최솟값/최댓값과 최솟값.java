class Solution {
    public String solution(String s) {
        String answer = "";
        int num = 0;
        int max = -9999;
        int min = 9999;
        String[] strArr = s.split(" ");
        for (int i =0; i <strArr.length; i++) {
            if (strArr[i].charAt(0) == '-') {
                String str = strArr[i].substring(1,strArr[i].length());
                num = -1 * Integer.parseInt(str);
            }
            else num = Integer.parseInt(strArr[i]);
            
            max = Math.max(num,max);
            min = Math.min(num,min);
            
        }
        answer = min + " " + max;
        return answer; 
    }
}