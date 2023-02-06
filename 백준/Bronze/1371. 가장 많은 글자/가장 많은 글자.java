import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        
        // 스캐너 설정
        Scanner sc = new Scanner(System.in);

        // 알파벳 있는 문자열 선언 및 초기화

        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] charr = abc.toCharArray();

        // 해쉬맵 선언
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        // hasNextLine을 while문의 조건식으로 작성
        while(sc.hasNextLine()) {
            
            // 한 줄씩 str로 받기
            String str = sc.nextLine();

            // for 반복문을 통해 hashMap에 값 넣어주기
            for (int i= 0; i < str.length(); i++) {
                
                // 만약 hashMap key에 문자가 있다면 기존 value값에 +1 할당
                if (hashMap.containsKey(str.charAt(i))) {
                    hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
                }
                
                // 만약 hashMap key에 문자가 있다면 value값에 1 할당
                else hashMap.put(str.charAt(i), 1);
            }
        }

        // 가장 큰 수 체크!
        int num = 0;
        for (int i =0 ; i < charr.length; i++) {
            if (hashMap.containsKey(charr[i])) {
                num = Math.max(num,hashMap.get(charr[i]));
            }
        }

        // 출력할 문자열 선언 및 초기화
        String result = "";

        //for 반복문을 통해 있는 가장 큰수와 같은 key를 찾아 출력
        for (char ch : charr) {
            if (hashMap.containsKey(ch) && num == hashMap.get(ch)) {
                result = result + ch;

            }
        }
        // 결과 값 출력
        System.out.println(result);
        
        //scanner 닫기
        sc.close();
    }
}
