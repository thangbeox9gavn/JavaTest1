import java.util.*;

public class HauToTienTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String n = sc.nextLine();
			System.out.println(postToPre(n));
		}
	}

	static boolean isOperator(char x) {
		switch (x) {
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		return false;
	}

	static String postToPre(String post) {
		Stack<String> s = new Stack<String>();

		for (int i = 0; i < post.length(); i++) {
			if (isOperator(post.charAt(i))) {

				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();

				String temp = post.charAt(i) + op2 + op1;

				s.push(temp);
			} else {
				s.push(post.charAt(i) + "");
			}
		}

		String ans = "";
		for (String string : s) {
			ans += string;
		}
		return ans;
	}
}
