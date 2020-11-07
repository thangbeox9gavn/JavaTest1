import java.util.*;

public class TinhBieuThucHauTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String n = sc.nextLine();
			System.out.println(evaluatePostfix(n));
		}
	}

	static int evaluatePostfix(String post) {
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < post.length(); i++) {
			char c = post.charAt(i);
			if (Character.isDigit(c)) {
				s.push(c - '0');
			} else {
				int val1 = s.pop();
				int val2 = s.pop();

				switch (c) {
				case '+':
					s.push(val2 + val1);
					break;
				case '-':
					s.push(val2 - val1);
					break;
				case '*':
					s.push(val2 * val1);
					break;
				case '/':
					s.push(val2 / val1);
					break;
				}
			}
		}
		return s.pop();
	}
}
