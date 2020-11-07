
import java.util.*;

public class SoFibonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		long F[] = new long[100];
		F[0] = 0;
		F[1] = 1;
		for (int i = 2; i <= 92 ; i++) {
			F[i] = F[i-1] + F[i-2];
		}
		t = sc.nextInt();
		while (t -->0) {
			n = sc.nextInt();
			System.out.println(F[n]);
		}
	}
}
