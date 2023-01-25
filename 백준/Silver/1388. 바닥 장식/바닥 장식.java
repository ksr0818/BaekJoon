import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] sr = s.split(" ");
        int col = Integer.parseInt(sr[0]);
        int row = Integer.parseInt(sr[1]);

        int count =0;

        char[][] graph = new char[col][row];

        for (int i =0; i < col; i++) {
            graph[i] = br.readLine().toCharArray();
            for (int j=0; j<row; j++) {
                if(graph[i][j] == '-') {
                    count++;
                    while (j < row && graph[i][j] == '-') j++;

                }
            }
        }

        for (int i =0; i < row; i++) {
            for (int j=0; j<col; j++) {
                if(graph[j][i] == '|') {
                    count++;
                    while (j < col && graph[j][i] == '|') j++;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}