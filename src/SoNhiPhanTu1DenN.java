import java.util.*;
public class SoNhiPhanTu1DenN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(generate(n));
		}
	}
	
	static String generate(int n) {
		Queue<String> q = new LinkedList<>();
		StringBuilder s = new StringBuilder();
		q.add("1");
		while(n-- > 0 ) {
			q.add(q.peek() + "0");
			q.add(q.peek() + "1");
			s.append(q.peek()+" ");
			q.remove();
		}
		return s.toString();
	}
}
