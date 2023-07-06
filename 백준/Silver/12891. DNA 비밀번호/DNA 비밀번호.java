import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] A;

        int[] checkArr = new int[4];
        int[] myArr = new int[4];
        int checkNum = 0;
        int count = 0;

        A = sc.nextLine().toCharArray();

        st = new StringTokenizer(sc.nextLine());
        for (int i=0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) {
                checkNum++;
            }
        }

        for (int i=0; i < P; i++) {
            switch(A[i]) {
                case 'A' :
                    myArr[0]++;
                    if (myArr[0] == checkArr[0]) checkNum++;
                    break;
                case 'C' :
                    myArr[1]++;
                    if (myArr[1] == checkArr[1]) checkNum++;
                    break;
                case 'G' :
                    myArr[2]++;
                    if (myArr[2] == checkArr[2]) checkNum++;
                    break;
                case 'T' :
                    myArr[3]++;
                    if (myArr[3] == checkArr[3]) checkNum++;
                    break;
            }
        }

        if (checkNum == 4) count++;

        for (int i =P; i < S; i++) {
            int j = i-P;
            switch(A[i]) {
                case 'A' :
                    myArr[0]++;
                    if (myArr[0] == checkArr[0]) checkNum++;
                    break;
                case 'C' :
                    myArr[1]++;
                    if (myArr[1] == checkArr[1]) checkNum++;
                    break;
                case 'G' :
                    myArr[2]++;
                    if (myArr[2] == checkArr[2]) checkNum++;
                    break;
                case 'T' :
                    myArr[3]++;
                    if (myArr[3] == checkArr[3]) checkNum++;
                    break;
            }

            switch(A[j]) {
                case 'A' :
                    if (myArr[0] == checkArr[0])
                        checkNum--;
                    myArr[0]--;
                    break;
                case 'C' :
                    if (myArr[1] == checkArr[1])
                        checkNum--;
                    myArr[1]--;
                    break;
                case 'G' :
                    if (myArr[2] == checkArr[2])
                        checkNum--;
                    myArr[2]--;
                    break;
                case 'T' :
                    if (myArr[3] == checkArr[3])
                        checkNum--;
                    myArr[3]--;
                    break;
            }
            if (checkNum == 4) count++;
        }
        System.out.println(count);
    }
}
