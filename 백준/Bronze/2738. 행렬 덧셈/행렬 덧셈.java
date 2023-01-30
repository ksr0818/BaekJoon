import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 스캐너 받기 위한 설정
        Scanner sc = new Scanner(System.in);
        
        // 행과 열에 대한 정보를 스캐너로 받아 N M으로 저장
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // N*M 행렬로 나타낼 수 있는 2차원 배열 2개 생성
        int[][] matrix1 = new int[N][M];
        int[][] matrix2 = new int[N][M];

        //스캐너의 값을 받아 첫번째 매트릭스 생성하는 반복문 실행
        for (int i =0; i <N; i++) {
            for (int j=0; j < M; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        //스캐너의 값을 받아 두번째 매트릭스 생성하는 반복문 실행
        for (int i =0; i <N; i++) {
            for (int j=0; j < M; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        //두 행렬의 값을 더한 후 그 값을 바로 프린트하는 반복문 실행
        for (int i =0; i <N; i++) {
            for (int j=0; j < M; j++) {
                int num = matrix1[i][j] + matrix2[i][j];
                System.out.println(num);
            }
        }
    }
}
