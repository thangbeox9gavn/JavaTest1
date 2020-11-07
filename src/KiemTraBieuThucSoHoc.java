import java.util.*;

public class KiemTraBieuThucSoHoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String n = sc.nextLine();
			boolean OK = true;
			Stack<Character> s = new Stack<Character>();
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == ')') {
					OK = true;
					char top = s.peek();
					s.pop();
					while (top != '(') {
						if (top == '+' || top == '-' || top == '*' || top == '/') {
							OK = false;
						}
						top = s.peek();
						s.pop();
					}
					if (OK) {
						break;
					}
				} else {
					s.push(n.charAt(i));
				}
			}
			if (OK) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
