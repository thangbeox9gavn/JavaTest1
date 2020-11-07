
import java.util.*;

public class Bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			int[][] A = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			
		}
		
	}
	
	public static boolean right(int[][] A, int i, int j) {
		if (A[i][j+1] == 1) {
			return true;
		}
		return false;
		
	}
	public static boolean down(int[][] A, int i, int j) {
		if (A[i+1][j] == 1) {
			return true;
		}
		return false;
		
	}
	public static void timDuong(int[][] A, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (right(A,i,j)) {
					System.out.print("R");

				}else {
					if (down(A,i,j)) {
						System.out.print("D");
					}
				}
				
			}
		}
	}
}
