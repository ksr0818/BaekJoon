import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        int len3 = sc.nextInt();

        list.add(len1);
        list.add(len2);
        list.add(len3);

        Collections.sort(list);

        if (list.get(0) + list.get(1) <= list.get(2)) {
            System.out.println(list.get(0) + list.get(1) + list.get(0) + list.get(1) -1);
        }
        else System.out.println(len1 + len2+ len3);

        }
    }