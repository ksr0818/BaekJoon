import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();
        int bombsize = bomb.length();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));

            if(stack.size()>= bombsize) {
                boolean is_bomb = true;


                for(int j=0; j<bombsize; j++) {
                    if(stack.get(stack.size()-bombsize+j) != bomb.charAt(j)) {
                        is_bomb = false;
                        break;
                    }
                }
                if(is_bomb) {
                    for(int j=0; j<bombsize; j++) {
                        stack.pop();
                    }
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for(Character c : stack) {
            sb.append(c);
        }
        System.out.println(sb.length()==0? "FRULA" : sb.toString());
        br.close();
    }
}

// 메모리 문제로 실패한 list 사용


//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        // String으로 스캐너 입력 받기! (문자열, 폭발 문자열)
//        String str = bf.readLine();
//        String bomb = bf.readLine();
//
//        // 결과 값을 저장할 String 생성
//        String result = new String("");
//
//        // 문자열을 저장할 문자 배열 생성
//        String[] strarr = new String[str.length()];
//        String[] bombarr = new String[str.length()];
//        List<String> char_list = new ArrayList<>();
//
////         for 반복문을 통해 str을 문자로 변경하여 해당 문자가 chararr과 같은지 비교
//        for (int i =0; i < str.length(); i++) {
////            strarr[i] = String.valueOf(str.charAt(i));
//            char_list.add(String.valueOf(str.charAt(i)));
//        }
//
//        for(int i =0; i < bomb.length(); i++ ) {
//            bombarr[i] = String.valueOf(bomb.charAt(i));
//        }
//
//        // chararr을 리스트로 변경 후 해당 인덱스 제거!
////        List<String> char_list = new ArrayList<>(Arrays.asList(strarr));
//
//        for (int i =0; i < strarr.length; i++) {
//            while(char_list.contains(bombarr[i])) {
//                char_list.remove(bombarr[i]);
//            }
//        }
//
//        if (char_list.size() ==0) System.out.println("FRULA");
//
//        for (String item : char_list) {
//            result += item;
//        }
//
//        System.out.println(result);
//        bf.close();
//    }
//}