
import java.util.*;

public class UocSoNguyenToLonNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		long n;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextLong();
			System.out.println(timUoc(n));
		}
		
	}
	public static long timUoc(long n) {
		long max = 0;
		while (n % 2 == 0) {
			max = 2;
			n/=2;
		}
		for (int i = 3; i <= Math.sqrt(n); i+=2) {
			while(n%i == 0) {
				n/=i;
				max = i;
			}
		}
		if (n > 1) {
			max = n;
		}
		return max;
	}
}
