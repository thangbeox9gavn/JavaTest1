

import java.util.*;

public class HoanViNguoc {
	static boolean OK = false;
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , t;
		t = sc.nextInt();
		while (t-- > 0) {
			OK = false;
			n = sc.nextInt();
			int A[] = new int[1000];
			String e = "";
			List<String> list = new ArrayList<String>();
			for (int i = 1; i <= n; i++) {
				A[i] = i;
				e += String.valueOf(i); 
			}	
			list.add(e);
			while (!OK) {
				sinh(A,n,list);
			}
			Collections.reverse(list); 
			for (String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
	public static void sinh(int[] A,int n, List<String> list) {
		int i = n,j,t;
		while (A[i] > A[i+1]) i--;
		if (i > 0) {
			String b ="";
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
			for (int k = 1; k <= n; k++) {
				b += String.valueOf(A[k]);
			}
			list.add(b);
		}
		else {
			OK = true;
		}
	}
	
}

