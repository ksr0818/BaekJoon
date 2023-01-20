import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 입력

        Scanner sc = new Scanner(System.in);
        // 첫번째 인자 개수로 변수 설정
        int num = sc.nextInt();
        // num개수만큼 input 배열 생성
        int[] input = new int[num];

        // 변수 생성 및 초기화
        int count = 0;
        int next = 0;

        // input에 scanner로 배열 할당
        for (int i =0; i <num; i++) {
            input[i] = sc.nextInt();
        }

        // 순환을 통한 count
        for(int i=0; i < num; i++) {
            if (input[i] ==next && next== 0) {
                count++;
                next=1;
                continue;
            }
            else if(input[i] ==next && next== 1) {
                count++;
                next=2;
                continue;
            }
            else if(input[i] ==next && input[i]== 2) {
                count++;
                next=0;
                continue;
            }
        }
        System.out.println(count);
    }
}
