import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <60) System.out.println("F");
        else if (num<70) System.out.println("D");
        else if (num<80) System.out.println("C");
        else if (num<90) System.out.println("B");
        else System.out.println("A");

        }
    }