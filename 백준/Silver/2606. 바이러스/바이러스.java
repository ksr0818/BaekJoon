import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt(); // 컴퓨터의 수
        int m = sc.nextInt(); // 간선의 수

        graph=new int[n+1][n+1];
        isVisited = new boolean[n+1];
        for(int i=0;i<m;i++) { // 그래프 만들기
            int a=sc.nextInt();
            int b = sc.nextInt();
            graph[a][b]=1;
            graph[b][a]=1;
        }

        virus(1);
    }

    static int graph[][];
    static boolean[] isVisited;

    public static void virus(int num){
    Queue<Integer> queue = new LinkedList<>();

    isVisited[num] = true;
    queue.add(num);

    int infection = 0;
    while(queue.peek() != null) {
        int a = queue.poll();

        for (int i=0; i< graph.length; i++) {
            if (graph[a][i] == 1 && !isVisited[i]) {
                queue.add(i);
                isVisited[i] = true;
                infection++;
            }
        }

    }
        System.out.println(infection);
    }
}
