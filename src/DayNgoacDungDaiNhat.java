import java.util.*;
public class DayNgoacDungDaiNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String n = sc.nextLine();
			int count = 0;
			Stack<Integer> s = new Stack<Integer>();
			s.push(-1);
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == '(') {
					s.push(i);
				} else {
					s.pop();
					if (s.size() > 0) {
						count = Math.max(count, i - s.peek());
					}
					if (s.size() == 0) {
						s.push(i);
					}
				}
			}
			System.out.println(count);
		}
	}
}
