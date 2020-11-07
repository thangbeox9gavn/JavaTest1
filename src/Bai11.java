import java.util.*;

public class Bai11 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n,k;
        t = sc.nextInt();
        while(t-- >0) {
        	n = sc.nextInt();
        	boolean OK = false;
        	boolean check[] = new boolean[n];
        	int a[] = new int[100];
        	String c = new String();
        	c = sc.nextLine();
        	while (!OK) {
				
			}
        }
    }
    
    public static void Next_Combination(int C[],int k,int n,boolean OK){
		int i, j;
		i = k;
		while (i > 0 && C[i] == n - k + i) i--;
		if (i > 0) {
			 C[i] = C[i] + 1;
			 for (j = i + 1; j <= k; j++) {
				 C[j] = C[i] + j - i;
			 }
		}else OK = true;
	}
    
    public static void xuatMang(int A[],int n)
    {
    	for(int i=1;i<=n;i++)
    		System.out.print(A[i]);
    	System.out.print(" ");
    }
}