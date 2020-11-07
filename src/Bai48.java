import java.util.*;

public class Bai48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Vector<Integer> v = new Vector<>();
			for (int i = n - 1; i >= 0; i--) {
				v.add(a[i]);
			}
			for (int i = 0; i < n; i++) {
				int j = v.size() - 1;
				while (v.get(j) <= a[i]) {
					j--;
				}
				v.remove(v.size() - 1);
				if (j >= 0)
					System.out.print(v.get(j) + " ");
				else
					System.out.print("-1" + " ");
			}
			System.out.println("");
		}
	}
}
