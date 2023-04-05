import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());

        int sum = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            sum++;
        }

        System.out.println(sum);
    }
}