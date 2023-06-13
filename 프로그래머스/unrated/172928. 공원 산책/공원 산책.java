import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        // 목표 : 로봇 강아지의 마지막 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 리턴
        
        // 방향을 위한 룩업 테이블
        HashMap<Character, int[]> DIR = new HashMap<Character, int[]>() {{
            put('N', new int[]{-1,0});
            put('S', new int[]{1,0});
            put('W', new int[]{0,-1});
            put('E', new int[]{0,1});
        }};
        
        int R = park.length;
        int C = park[0].length();
        int sR = 0, sC =0;
        
        for (int r =0 ; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (park[r].charAt(c) == 'S') {
                    sR = r;
                    sC = c;
                    break;
                }
            }
        }
        
        int r = sR, c= sC;
        
        for (int i =0; i <routes.length; i++) {
            String[] route = routes[i].split(" ");
            char op = route[0].charAt(0);
            int n = Integer.parseInt(route[1]);
            
            // 현재 위치에서 op방향으로 n만큼 이동할 수 있으면 이동한다.
            // 현재 위치를 변경한다.
            int[] diff = DIR.get(op);
            int dR = diff[0];
            int dC = diff[1];
            int nextR = r + dR * n;
            int nextC = c + dC * n;
            
            if (isVaild(nextR, nextC, R, C) == true && isClear(park, r, c, dR, dC, n)) {
                r = nextR;
                c = nextC;
            }
            
            
        }
        return new int[]{r,c};
    }
    
    private boolean isVaild(int r, int c, int R, int C) {
        return 0 <=r && r < R && 0 <= c && c < C;
    }
    
    private boolean isClear(String[] park, int r, int c, int dR, int dC, int n) {
        while(n > 0) {
            r += dR;
            c += dC;
            if (park[r].charAt(c) == 'X') return false;
            n--;
        }
        return true;
    }
}