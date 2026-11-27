
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) {
                return null;
            }
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        String tok = next();
        int initialW = Integer.parseInt(tok);
        int noParts = Integer.parseInt(next());
        int[] partsW = new int[noParts + 1];
        for (int i = 1; i <= noParts; i++) {
            partsW[i] = Integer.parseInt(next());
        }
        int currentW = initialW;
        int noRequests = Integer.parseInt(next());
        boolean[] isParied = new boolean[noParts + 1];
        for (int i = 0; i < noRequests; i++) {
            String reqTok = next();
            int part = Integer.parseInt(reqTok);
            if (!isParied[part]) {
                currentW += partsW[part];
            } else {
                currentW -= partsW[part];
            }
            isParied[part] = !isParied[part];
            sb.append(currentW + "\n");
        }
        System.out.println(sb);
    }
}
