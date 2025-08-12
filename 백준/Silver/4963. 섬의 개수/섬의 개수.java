import java.io.*;
import java.util.*;

public class Main {
    static int w, h;
    static int[][] map;
    static boolean[][] visited;
    static final int[] dx = {-1,-1,-1, 0, 0, 1, 1, 1};
    static final int[] dy = {-1, 0, 1,-1, 1,-1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;

            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) map[i][j] = Integer.parseInt(st.nextToken());
            }

            int islands = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        islands++;
                    }
                }
            }
            out.append(islands).append('\n');
        }
        System.out.print(out);
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new ArrayDeque<>();
        visited[sx][sy] = true;
        q.offer(new int[]{sx, sy});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int dir = 0; dir < 8; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
