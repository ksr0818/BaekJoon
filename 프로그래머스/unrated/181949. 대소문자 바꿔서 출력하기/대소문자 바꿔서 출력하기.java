import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (int i =0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                char ch =Character.toLowerCase(a.charAt(i));
                answer = answer + ch;
            }
            else {
                char ch = Character.toUpperCase(a.charAt(i));
                answer = answer + ch;
            }
        }
        
        System.out.println(answer);
    }
}