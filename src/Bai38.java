import java.util.*;
public class Bai38 {
	static int MOD = (int) 10e9 + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- >0) {
			long n = sc.nextLong();
			System.out.println(fibo(n));
		}
	}
	
	static long fibo(long n) {
		if (n==0) return 1;
	    if (n==1 || n == 2) return 1;
	    else {
	    	return (fibo(n-1)+fibo(n-2))%MOD;
	    }
	}
}
