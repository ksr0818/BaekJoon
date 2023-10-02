import static java.lang.Math.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {2,2};
        int row = 0;
        int column = 0;
        
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i ==0) {
                row = yellow / i;
                column = i;
                if ((row +2) * (column + 2) == brown + yellow) {
                    return new int[]{row+2, column+2};
                
                }
            }
            
            
            
        }
        return answer;
    }
}