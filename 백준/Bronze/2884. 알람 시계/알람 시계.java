import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute <45) {
            hour = hour -1;
            if (hour <0) hour = hour+24;
            minute = minute -45 +60;
        }

        else minute = minute -45;

        System.out.print(hour);
        System.out.print(" ");
        System.out.print(minute);
        }
    }