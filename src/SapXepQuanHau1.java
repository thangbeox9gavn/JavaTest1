import java.util.*;
public class SapXepQuanHau1 {
	static int A[] = new int[100];
	static boolean Cot[] = new boolean[100];
	static boolean Xuoi[] = new boolean[100];
	static boolean Nguoc[] = new boolean[100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while (t-- >0) {
			int count = 0;
			n = sc.nextInt();
			List<String> list = new ArrayList<String>();
			Try(1,n,list);
			System.out.println(list.size());
		}
	}
	
	
	public static void Try(int i,int n,List<String> list) {
		int j;
		for (j = 1; j <= n; j++) {
			if (!Cot[j] && !Xuoi[i-j+n] && !Nguoc[i+j-1]) {
				A[i] = j;
				Cot[j] = true;
				Xuoi[i-j+n] = true;
				Nguoc[i+j-1] = true;
				if (i == n) {
					String b = "";
					for (int k = 1; k <= n; k++) {
						b += String.valueOf(A[k]) +" ";
					}
					list.add(b);
				}else {
					Try(i+1,n,list);
				}
				Cot[j] = false;
				Xuoi[i-j+n] = false;
				Nguoc[i+j-1] = false;
			}
		}
	}
}
