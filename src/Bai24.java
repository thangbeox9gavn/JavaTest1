import java.util.*;
public class Bai24 {
	static boolean OK = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			int X[] = new int[n+1];
//			int T[] = new int[n+1];
//			for (int i = 0; i < X.length; i++) {
//				X[i] = 1;
//			}
			X[0] = 0;
//		    T[0] = 0;
		    List<String> list = new ArrayList<String>();
//		    xuLy(n,X,T,1,list);
//			Collections.reverse(list);
//			for (String string : list) {
//				System.out.print(string+" ");
//			}
//		    while (OK) {
//		    	Next_Division(n,X);
//		    	for (int i = 0; i < X.length; i++) {
//					System.out.print(X[i]+" ");
//				}
//		    	System.out.println();
//			}
		}
	}
	
//	public static void Next_Division(int k,int X[]){
//	     int i = k, j, R, S,D;
//	     while (i > 0 && X[i]==1 ) i--;
//	     if (i>0 ) {
//	              X[i] = X[i] - 1;   
//	              D = k - i + 1;
//	              R = D / X[i];    
//	              S = D % X[i]; 
//	              k= i;
//	       if (R>0) {
//	             for ( j = i +1; j<=i + R; j++) 
//	                       X[j] = X[i];
//	             k = k + R;
//	        }
//	        if (S>0 ){ 
//	              k = k +1; X[k] = S; 
//	        }
//	     }
//	     else OK = false;
//	}
	
//	public static void xuLy(int n, int X[], int T[], int i, List<String> list)
//	{
//	    int j;
//	    for(j = X[i - 1]; j <= (n - T[i - 1]); j++)
//	    {
//	    	StringBuilder sb = new StringBuilder();
//	    	sb.append('(');
//	        X[i] = j;
//	        T[i] = T[i - 1] + j;
//	 
//	        if(T[i] == n)
//	        {
//	            int temp;
//	            for(temp = i;  temp >= 1; temp--) 
//	            {
//	            	if (temp > 1) {
//	            		sb.append(X[temp]+" ");
//					}else {
//						sb.append(X[temp]);
//					}
//	               
//	            }
//	            sb.append(')');
//	           list.add(sb.toString());
//	        }
//	        else
//	        {
//	            xuLy(n, X, T, i + 1,list);
//	        }
//	    }
//	}
}
