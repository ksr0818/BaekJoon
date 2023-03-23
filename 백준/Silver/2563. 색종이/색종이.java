import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] XyArr = new int[100][100];

        int count = 0;

        for (int i =0; i <num;i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int j=X; j<X+10;j++) {
                for (int k =Y; k<Y+10; k++) {
                    XyArr[j][k] = 1;
                }
            }
        }

        for (int i=0; i < 100; i++) {
            for (int j=0; j <100;j++) {
                if(XyArr[i][j]==1) count++;
            }
        }

        System.out.println(count);

    }
}