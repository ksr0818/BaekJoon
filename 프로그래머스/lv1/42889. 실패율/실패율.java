import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        // 목표 : 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return
        // tie breaker : 만약 시패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
        // 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0으로 정의한다.
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        
        // int[] stages : 길이 최대 200K(200,000), 각 사용자가 현재 멈춰있는 스테이지 번호
        // 다했으면 N+1이 저장
        
        // 문제의 시작과 끝
        // 시작부터 끝까지 나아가는 방향
        // 문제의 크기 = stages.length(200K) - O(N) 또는 O(logN), O(logN * N)으로 풀어야 하나, 탐색 공간이 줄어드는 경우 (안봐도 되는 부분)가 생기지는 않으므로 O(N)
        
        // logN = 17~18, N은 가능 N^2은 불가능
        // logN은 아님 모든 스테이지를 다 봐야하기 떄문에!
        // 반복문으로 풀어야 함(이중 X)
        
        
        // N =5
        // stages = [2, 1, 2, 6, 2, 4, 3, 3]
        
        
        // 스테이지별 실패율을 구한다.
        // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        // 스테이지에 도달한 플레이어 수 : 해당 스테이지 번호 이상의 개수
        // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 : 해당 스테이지 번호의 개수
        // failRates
        
        
        // 실패율이 높은 스테이지부터 내림차순으로
        // [3,4,2,1,5]
        
        // 스테이지 별로 도달한 플레이어 수를 저장
        // stayNum[i] = i번 스테이지에 도달한 적이 있는 플레이어 수
        int[] stayNum = new int[N+2];
        for (int s : stages) stayNum[s]++;
        
        // 실패율 계산을 위한 변수
        int acc=0;
        
        // 스테이지별 실패율을 저장하는 자료: 2차원 배열
        double[][] failRates = new double[N][2];
        for (int i=1; i <=N; i++) {
            double failRate =0;
            if (stages.length - acc > 0) {
                failRate = (double) stayNum[i] / (stages.length -acc);
            }
                
            // 도달한 플레이어 수를 누적
            acc += stayNum[i];
            
            // 스테이지 번호와 실패율을 저장
            failRates[i -1] = new double[] {i, failRate};
        }
        
        Arrays.sort(failRates, (a,b) -> {
            // tie breaker : 만약 시패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
            if (a[1] == b[1]) return Double.compare(a[0],b[0]);
            else return Double.compare(b[1],a[1]);
        });
        
        // 정렬된 스테이지 번호를 변경
        // 목표 : 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return
        int[] result = new int[N];
        for (int i=0; i< N; i++) {
            result[i] = (int) failRates[i][0];
        }
            
        return result;
        
        
    }
}