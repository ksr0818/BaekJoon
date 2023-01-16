import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<String> stack = new Stack<>();

    int num = Integer.valueOf(br.readLine());
    for(int i = 0; i < num; i++) {

        String[] input = br.readLine().split(" ");

        if (input[0].contains("push")) {
            stack.push(input[1]);
            }

        if (input[0].contains("pop")) {
            if(stack.isEmpty()) bw.write("-1" + "\n");
            else bw.write(stack.pop()+"\n");
            }

        if (input[0].contains("empty")) {
            if (stack.isEmpty()) bw.write(1+ "\n");
            else bw.write(0+ "\n");
            }

        if (input[0].contains("size")) {
            bw.write(stack.size() + "\n" );
            }

        if (input[0].contains("top")) {
            if (stack.isEmpty()) bw.write(-1+ "\n");
            else bw.write(stack.peek()+ "\n");
            }

        }
    bw.close();
    }
}