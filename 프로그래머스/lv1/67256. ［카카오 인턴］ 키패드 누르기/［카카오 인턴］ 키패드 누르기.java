class Solution {
    public String solution(int[] numbers, String hand) {
        
        // 1. 2580은 더 가까운 손
        // 1.1 거리가 같으면 오른손/왼손잡이 여부를 따름
        
        // 핵심은
        // 타겟 번호가 2, 5, 8, 0 일 때
        // 매 시점(라운드, 순서)마다 왼손과 오른손 위치를 알 수 있어야 하고
        // 각 위치에서 타겟 번호까지의 거리를 알 수 있어야 한다.
        // 룩업테이블로 구현
        
        // dist[s][d]: s-> d까지의 (맨해튼) 거리
        // 단 2,5,8,0 만을 고려하고 순서대로 고려한다.
        // dist[1][5] : 1->5까지의 거리이므로 2를 저장
        // 0을 11로 매핑하였음
        int[][] dist = {
            {}, // dummy, 0은 11로 매핑함
            {1, 2 ,3, 4}, // 1부터 2, 5 ,8, 11까지의 거리
            {0, 1, 2, 3}, //2
            {1, 2, 3, 4}, //3
            {2, 1, 2, 3}, //4
            {1, 0, 1, 2}, //5
            {2, 1, 2, 3}, //6
            {3, 2, 1, 2}, //7
            {2, 1, 0 ,1}, //8
            {3, 2, 1, 2}, //9
            {4, 3, 2, 1}, //10 (*)
            {3, 2, 1, 0}, //11 (0)
            {4, 3, 2, 1} //12 (#)
            
            // 출발 : 2,5,8,11
            // /3 : 0, 1, 2, 3
            // 목표: 0, 1, 2, 3
        };
        
        int leftCursor = 10;
        int rightCursor = 12;
        
        // 목표 : LR의 연속된 문자열
        StringBuilder moves = new StringBuilder();
        
        // 
        for (int i=0; i < numbers.length; i++) {
            // 각 숫자를 처리하면서 왼/오른손 위치를 변경한다.
            // 0을 11로 매핑함
            int target = (numbers[i] == 0) ? 11 : numbers[i];
            
            // 1,4,7 -> 왼손으로 처리
            if (target % 3 == 1) {
                moves.append('L');
                leftCursor = target;
            }
            
            // 3,6,9 -> 오른손으로 처리
            else if(target % 3 == 0) {
                moves.append('R');
                rightCursor = target;   
            }
            else {
                int num = (int) (target/3);
                int leftDist = dist[leftCursor][num];
                int rightDist = dist[rightCursor][num];
                
                if (leftDist < rightDist) {
                    moves.append('L');
                    leftCursor = target;
                }
                else if (leftDist > rightDist){
                    moves.append('R');
                    rightCursor = target; 
                }
                
                else {
                    if (hand.equals("right")) {
                        moves.append('R');
                        rightCursor = target;  
                    }
                    else {
                        moves.append('L');
                        leftCursor = target;
                    }
                }
                    
            }
        }
        
        String answer = new String(moves);
        
        return answer;
    }
}


// [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5] (맨해튼 거리)
// * #
// L R
// 1 #
// 1 3
// 4 3
// 5 3
// 8 3
// 8 2
// 1 2
// 4 2
// 
// 

// 1 2 3
// 4 5 6 
// 7 8 9
// * 0 #