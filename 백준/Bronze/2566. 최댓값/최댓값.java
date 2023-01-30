import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너로 수를 받을 수 있도록 세팅
        Scanner sc = new Scanner(System.in);

        // 9x9 매트릭스 생성
        int[][] matrix = new int[9][9];

        //가장 큰수의 인덱스 받을 변수 선언 및 할당

        int max_row = 0;
        int max_col = 0;

        // scanner를 통해 받을 가장 큰수에 대한 변수 선언 및 할당
        int max_num = 0;

        // for를 통해 9x9행렬의 수를 받아 값 할당
        for (int i =0; i < 9; i++) {
            for (int j=0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();
                if (max_num < matrix[i][j]) {
                    max_num = matrix[i][j];
                    max_row = i;
                    max_col = j;
                }
            }
        }
        // 최댓값 출력
        System.out.println(max_num);
        
        // 인덱스 출력 (0행이 아닌 1행부터 시작하므로 +1)
        System.out.printf("%d %d\n",max_row+1,max_col+1);
    }
}
