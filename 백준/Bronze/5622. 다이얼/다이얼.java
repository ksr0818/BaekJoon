import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] chArr = str.toCharArray();

        int sum = 0;

        for (int i =0; i < chArr.length; i++) {
            if(chArr[i] == 'A' || chArr[i]=='B' || chArr[i]=='C')
                sum += 3;

            else if(chArr[i] == 'D' || chArr[i]=='E' || chArr[i]=='F')
                sum += 4;

            else if(chArr[i] == 'G' || chArr[i]=='H' || chArr[i]=='I')
                sum += 5;

            else if(chArr[i] == 'J' || chArr[i]=='K' || chArr[i]=='L')
                sum += 6;

            else if(chArr[i] == 'M' || chArr[i]=='N' || chArr[i]=='O')
                sum += 7;

            else if(chArr[i] == 'P' || chArr[i]=='Q' || chArr[i]=='R'|| chArr[i]=='S')
                sum += 8;

            else if(chArr[i] == 'T' || chArr[i]=='U' || chArr[i]=='V')
                sum += 9;

            else if(chArr[i] == 'W' || chArr[i]=='X' || chArr[i]=='Y' || chArr[i]=='Z')
                sum += 10;

        }
        System.out.println(sum);

    }
}