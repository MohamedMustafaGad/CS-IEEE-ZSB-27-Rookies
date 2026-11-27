
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        HashMap<Long, Integer> map = new HashMap<>(n * 2);

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            long val = Long.parseLong(st.nextToken());
            long predictedValue = x - val;

            if (map.containsKey(predictedValue)) {
                System.out.println(map.get(predictedValue) + " " + i);
                return;
            }
            map.putIfAbsent(val, i);
        }
        System.out.print("IMPOSSIBLE");
    }
}
