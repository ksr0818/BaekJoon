import java.util.Scanner;


public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char[][] chArr = new char[5][15];

        for(int i = 0 ; i < chArr.length; i++)
        {
            String str = sc.nextLine();

            for(int j = 0 ; j < str.length(); j ++)
            {
                chArr[i][j]=str.charAt(j);
            }
        }

        for(int i = 0 ; i < 15 ; i ++)
        {
            for(int j = 0 ; j < 5 ; j ++)
            {
                if(chArr[j][i]==' ' || chArr[j][i]=='\0')
                    continue;

                System.out.print(chArr[j][i]);
            }

        }
    }
}