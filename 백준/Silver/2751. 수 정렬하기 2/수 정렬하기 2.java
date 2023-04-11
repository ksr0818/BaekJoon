import java.util.*;


public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i =0; i < N; i++) {

            int num = sc.nextInt();
            numList.add(num);
        }

        Collections.sort(numList);

        for (int a : numList) {
            sb.append(a).append('\n');
        }

        System.out.println(sb);

    }
}