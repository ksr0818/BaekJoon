class Solution {
    public int solution(int n) {
        int sum = 0;
        int answer = 0;
        
        for (int i =1 ; i<= n; i++) {
            int num = i;
            sum = 0;
            while(true) {
                sum += num;
                if (sum == n ) answer++;
                else if (sum > n) break;
                else num++;
            }
            
        }
        
        return answer;
    }
}