import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        int max =0;
        char ch = '0';


        HashMap<Character, Integer> map = new HashMap();


        for (int i=0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                if (max <= map.get(str.charAt(i))) {
                    if (max == map.get(str.charAt(i))) {
                        ch ='?';
                    }
                    else {
                        max =Math.max(max, map.get(str.charAt(i)));
                        ch = str.charAt(i);
                    }
                }
            }
            else {
                map.put(str.charAt(i),1);
                if (max <=1) ch = str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
