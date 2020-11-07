

import java.util.*;

public class HoanviXauKyTu {
	static boolean OK = false;
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , t;
		String A;
		t = sc.nextInt();
		A = sc.nextLine();
		while (t-- > 0) {
			char[] B = new char[10];
			OK = false;
			List<String> list = new ArrayList<String>();
			
			A = sc.nextLine();
			for (int i = 0; i < A.length(); i++) {
				B[i+1] = A.charAt(i);
			}
			list.add(A);
			while (!OK) {
				sinh(B,A.length(),list);
			}
			for (String str : list) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
	public static void sinh(char[] A,int n, List<String> list) {
		int i = n,j;
		char t;
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

