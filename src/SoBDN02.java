import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class SoBDN02 {
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
		s.add("1");
		long a = Long.parseLong(s.peek());
		while(a % n != 0) {
			s.add(s.peek()+"0");
			s.add(s.peek()+"1");
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
 