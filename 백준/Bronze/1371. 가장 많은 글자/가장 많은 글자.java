import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {


        // 스캐너 설정
        Scanner sc = new Scanner(System.in);
        
        // 알파벳 있는 문자열 선언 및 초기화

        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] charr = abc.toCharArray();



        // 문자 선언 및 초기화
        HashMap<Character, Integer> hashMap = new HashMap<>();

        while(sc.hasNextLine()) {

            String str = sc.nextLine();

            for (int i= 0; i < str.length(); i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
                }
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
        System.out.println(result);
        
        sc.close();
    }
}
