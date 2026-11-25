
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int currentLen = 1;
        int max = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                max = ++currentLen > max ? currentLen : max;
            } else {
                currentLen = 1;
            }
        }
        System.out.println(max);
    }
}
