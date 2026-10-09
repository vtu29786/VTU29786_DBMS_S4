 import java.util.*;

public class Traffic {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();


    ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    for (int i = 0; i < n; i++)
        g.add(new ArrayList<>());

    for (int i = 0; i < m; i++) {
        int u = sc.nextInt() - 1;
        int v = sc.nextInt() - 1;
        g.get(u).add(v);
        g.get(v).add(u);
    }

    int s = sc.nextInt() - 1;
    int d = sc.nextInt() - 1;

    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();
    q.add(s);
    visited[s] = true;

    while (!q.isEmpty()) {
        int u = q.poll();
        for (int v : g.get(u)) {
            if (!visited[v]) {
                visited[v] = true;
                q.add(v);
            }
        }
    }

    System.out.println(visited[d] ? "YES" : "NO");
    sc.close();
}


}

