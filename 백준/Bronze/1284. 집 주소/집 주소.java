import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 설정
        Scanner sc = new Scanner(System.in);

        // 문자열 타입 변수 선언 및 초기화
        String str = "";

        // 문자 타입 변수 선언 및 초기화
        char ch = '0';

        // 합을 구할 int 변수 선언 및 초기화
        int num = 0;

        // while 반복문을 통해 숫자를 문자열로 받기
        while (true) {
            str = sc.nextLine();
            
            // for 반복문을 통해 숫자별 덧셈 수행
            for (int i =0; i < str.length(); i++) {
                
                // 만약 0만 들어올 경우 for문 탈출
                if (str.length() ==1 && str.charAt(0) =='0') {
                    break;
                }
                // 0일 경우 4 더하기
                if (str.charAt(i) == '0') {
                    num += 4;
                }
                
                // 1일 경우 2 더하기
                else if (str.charAt(i) == '1') {
                    num += 2;
                }
                
                // 나머지 경우 3 더하기
                else num += 3;

            }
            
            // 만약 num이 0이면 while문을 탈출
            if (num ==0) {
                break;
            }
            // num에 글자수사이 공백만큼 빼주고 양 옆의 공백 2 더해주기
            num += str.length()-1 + 2;
            
            // num을 출력
            System.out.println(num);
            
            // num 초기화
            num=0;
        }
    }
}
