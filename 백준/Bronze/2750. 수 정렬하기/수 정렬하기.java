import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i =0; i < N; i++) {
            numList.add(sc.nextInt());
        }

        Collections.sort(numList);

        for (int i=0; i < N; i++) {
            System.out.println(numList.get(i));
        }
    }
}
