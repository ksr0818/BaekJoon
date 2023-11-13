class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcm = 1;
        int lcm = 1;
        
        for (int i = 2; i <= (n+m)/2;) {
            if (n%i == 0 && m%i == 0) {
                gcm *= i;
                n = n/i;
                m = m/i;
            }
            else i++;
        
        }
        
        lcm = gcm * n * m;
        
        answer[0] = gcm;
        answer[1] = lcm;
        
        return answer;
    }
}