import java.util.*;
public class BieuThucTangGiam {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String data = scanner.next();
            System.out.print(calculate(data + " "));
            if (i != t - 1) {
                System.out.println();
            }
        }
    }

    private static String calculate(String data) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'D') {
                stack.add(i + 1);
            } else {
                result.append(i + 1);
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        return result.toString();
    }
}
