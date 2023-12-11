class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] dateArr = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weekArr = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int num = 0;
        
        for (int i =0; i < a; i++) {
            num += dateArr[i];
        }
        num += b-1;
        
        num = num%7;
        answer = weekArr[num];
        return answer;
    }
}