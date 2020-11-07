import java.util.*;
public class So0va9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			long n =sc.nextLong();
			Try(n);
		}
	}
	
	static void Try(long n) {
		Queue<String> s = new LinkedList<String>();
		long count = 0;
		s.add("9");
		long a = Long.parseLong(s.peek());
		while(a % n != 0) {
			s.add(s.peek()+"0");
			s.add(s.peek()+"9");
			a = Long.parseLong(s.peek());
			s.remove();
			if (a%n == 0) {
				System.out.println(a);
				return;
			}
			
		}
		System.out.println(a);
	}
}
 