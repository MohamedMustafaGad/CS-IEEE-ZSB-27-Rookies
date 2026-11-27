
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class E {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long[] arr = new long[num + 1];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(0 + " ");
            } else {
                sb.append(stack.peek() + 1 + " ");
            }

            stack.push(i);
        }
        System.out.println(sb);
    }
}
