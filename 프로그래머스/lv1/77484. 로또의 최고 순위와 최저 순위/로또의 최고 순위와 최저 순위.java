class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 목표 : 최고순위와 최저순위를 차례대로 배열에 담아서 리턴
        // 주어진 것 (조건)
        // 1. lottos : 길이 6의 배열, 0개 이상의 0과 1~45까지의 수가 저장
        // 2. win_nums : 길이 6의 배열, 당첨번호 6개가 저장
        // 3. 1,2는 정렬되어 있지 않다고 가정
        
        //lottos: [44,1,0,0,31,25]
        // win_nums: [31,10,45,1,6,19]
        
        // 1. 정렬 (필요 없음!)
        //lottos: [0,0,1,25,31,44]
        // win_nums: [1,6,10,19,31,45]
        
        // 2. lottos에서 당첨번호 개수를 계산 -> 최저 순위
        // 3. lottos에서 0이 전부 당첨번호로 가정 -> 최고 순위
        
        
        // 당첨 번호를 표시하는 자료 생성
        boolean[] wins = new boolean[46];
        for (int num: win_nums) wins[num] = true;
        
        // 순위 계산을 위한 배열
        //winsToRank[i] = i개 번호를 맞췄을 때 순위
        
        // 룩업 테이블!!! (이게 조금 더 직관적!)
        int[] winsToRank = {6,6,5,4,3,2,1};
    
        int least = 0;
        int wildcard = 0;
        
        // lottos 배열에서 이긴 번호의 개수와
        // 0의 개수를 계산
        for (int i=0; i <lottos.length; i++) {
            if(wins[lottos[i]] == true) least++;
            else if (lottos[i] ==0) wildcard++;
        }
    
        
        
        //int numZeros;
        //int alreadyWins;
        
        // 이렇게 짜지 마라!
        // if (numZeros + alreadyWins == 2) 5;
        //else if (numZeros + alreadyWins == 3) 4;
        // else if (numZeros + alreadyWins == 4) 3;
        
        
        // 최고순위와 최저순위를 차례대로
        int best = winsToRank[least+wildcard];
        int worst = winsToRank[least];
        return new int[]{best,worst};
        
        // return new int[]{winsToRank[least+wildcard], winsToRank[least]}
    }
}