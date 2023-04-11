import java.util.*;


public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i =0; i < N; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }

        Collections.sort(numList,Comparator.reverseOrder());

        System.out.println(numList.get(k-1));

    }
}