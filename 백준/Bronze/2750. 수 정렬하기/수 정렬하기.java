import java.math.BigDecimal;
import java.util.*;


public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i =0; i < N; i++) {
            int num = sc.nextInt();
            if (numList.contains(num)) {
                continue;
            }
            numList.add(num);
        }

        Collections.sort(numList);

        for (int a : numList) {
            System.out.println(a);
        }

    }
}