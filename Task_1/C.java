
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashSet<Long> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(st.nextToken());
            if (hs.add(num)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
