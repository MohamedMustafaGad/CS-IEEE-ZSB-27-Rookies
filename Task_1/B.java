
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size = in.nextInt();
        long sum = (long) size * (size + 1) / 2;
        if (sum % 2 == 1) {
            System.out.println("NO");
            return;
        }
        long target = sum / 2;
        boolean[] firstGroup = new boolean[size + 1];
        int firstCounter = 0;
        for (int i = size; i >= 1; i--) {
            if (i <= target) {
                firstGroup[i] = true;
                target -= i;
                firstCounter++;
            }
        }
        sb.append("YES\n");
        sb.append(firstCounter + "\n");
        for (int i = 1; i <= size; i++) {
            if (firstGroup[i]) {
                sb.append(i + " ");
            }
        }
        sb.append("\n");
        sb.append(size - firstCounter + "\n");
        for (int i = 1; i <= size; i++) {
            if (!firstGroup[i]) {
                sb.append(i + " ");
            }
        }
        System.out.print(sb);
    }
}
