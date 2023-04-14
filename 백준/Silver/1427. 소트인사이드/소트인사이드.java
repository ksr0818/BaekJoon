import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();
        List<Character> charList = new ArrayList<>();
        for (int i =0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }
        Collections.sort(charList,Collections.reverseOrder());

        for(char a : charList) {
            System.out.print(a);
        }
    }
}