import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        int money = 0;
        if (dice1 == dice2 && dice1 == dice3) {
            money = 10000 + 1000 * dice1;
        } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
            if (dice1 == dice2 || dice1 == dice3) {
                money = 1000 + 100 * dice1;
            } else
                money = 1000 + 100 * dice2;
        }
        else {
            if (dice1 >= dice2 && dice1 >= dice3) money = 100*dice1;
            else if (dice2 >= dice1 && dice2 >=dice3) money = 100*dice2;
            else money = 100*dice3;
        }
        System.out.println(money);
    }
}
