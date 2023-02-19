import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i =1; i <= num; i++) {
            String nums[] = new String[2];
            String str = br.readLine();
            nums = str.split(" ");
            sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            bw.write(String.valueOf("Case #"+ i + ": " + Integer.parseInt(nums[0])+ " + " +Integer.parseInt(nums[1])+ " = " + sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
