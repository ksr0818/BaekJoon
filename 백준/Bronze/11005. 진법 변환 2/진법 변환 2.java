import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        List<Character> charList = new ArrayList<>();

        while (N >0) {
            if (N % B >=10) {
                charList.add((char) (N%B-10 + 'A'));
            }
            else {
                charList.add((char) (N%B +'0'));
            }

            N /= B;
        }
        for (int i= charList.size() -1 ; i >=0; i--) {
            System.out.print(charList.get(i));
        }
    }
}