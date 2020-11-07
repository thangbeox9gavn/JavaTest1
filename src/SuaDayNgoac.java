import java.util.*;
public class SuaDayNgoac {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String data = scanner.next();
            System.out.print(calculate(data));
            if (i != t - 1) {
                System.out.println();
            }
        }
    }

    private static int calculate(String data) {
        int dem = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '(') {
                stack.add(data.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    stack.add('(');
                    dem++;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            dem++;
            stack.pop();
            stack.pop();
        }
        return dem;
    }
}
