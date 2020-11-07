
import java.util.*;

public class HoanViKeTiep {
	static boolean OK = false;
	
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , t;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			int A[] = new int[1000];
			for (int i = 1; i <= n; i++) {
				A[i] = sc.nextInt();
			}	
			if (!OK) {
				sinh(A,n);
				in(A,n);
			}
			
		}
	}
 	
 	public static void in(int[] a,int n) {
		for (int j = 1; j <= n; j++) {
			System.out.print(a[j]+" ");	
		}
		System.out.println();
	}
 
	
	public static void sinh(int[] A,int n) {
		int i = n,j,t;
		while (A[i] > A[i+1]) i--;
		if (i > 0) {
			String[] b = new String[n];
			j = n;
			while (A[i] > A[j]) j--;
			t = A[i];
			A[i] = A[j];
			A[j] = t;
			int d= i +1, c= n;
			while (d<c) {
				t = A[d];
				A[d] = A[c];
				A[c] = t;
				d++;c--;
			}
		}
		else {
			OK = true;
		}
	}
	
}
