import java.util.*;
public class Bai23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n,s;
		t = sc.nextInt();
		
		while(t-- > 0) {
			n = sc.nextInt();
			s = sc.nextInt();
			int a[] = new int[100];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			sortDESC(a);
		}
	}
	public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	
	public static void name(int[] a, int n, int s) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s / a[i] == 0) {
				count = s/a[i];
			}else {
				
			}
		}
	}
}
