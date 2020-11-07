import java.util.*;
public class Bai26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s,k,t;
		t = sc.nextInt();
		while(t-- > 0) {
			boolean STOP = false;
			n = sc.nextInt();
			k = sc.nextInt();
			int count = 0;
			int C[] = new int[100];
			String A = "";
			String B = "";
	    	for (int i = 1; i <= k; i++) {
	    		C[i] = sc.nextInt();
	    		A += C[i];
	    	}
	    	List<String> list = new ArrayList<String>();
	    	
	    	Next_Combination(C,k,n);
	    	for (int i = 1; i <= k; i++) {
	    		B += C[i];
	    		if (!A.contains(String.valueOf(C[i]))) {
					count++;
				}
			}
	    	if (A.equals(B)) {
				count = k;
			}
	    	System.out.print(count);
		}
	}
	public static void Next_Combination(int C[],int k,int n){
		int i, j;
		i = k;
		while (i > 0 && C[i] == n - k + i) i--;
		if (i > 0) {
			 C[i] = C[i] + 1;
			 for (j = i + 1; j <= k; j++) {
				 C[j] = C[i] + j - i;
			 }
		}
	}
}
