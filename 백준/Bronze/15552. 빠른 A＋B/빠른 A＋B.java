import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i =0; i < num; i++) {
            String nums[] = new String[2];
            String str = br.readLine();
            nums = str.split(" ");
            bw.write(String.valueOf(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
