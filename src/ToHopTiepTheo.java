import java.util.*;
public class ToHopTiepTheo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc, n, k;
		tc = sc.nextInt();
		for (int i = 1; i <= tc; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			int[] input = new int[50];
			int[] mark = new int[50];
			for (int j = 1; j <= k; j++) {
				input[j] = sc.nextInt();
				mark[input[j]] = 1;
			}
			int count = 0;
			boolean check = true;
			int j = k;
			while (j > 0 && input[j] == n - k + j)
				j--;
			if (j > 0) {
				input[j]++;
				if (mark[input[j]] != 1)
					count++;
				for (int m = j + 1; m <= k; m++) {
					input[m] = input[m - 1] + 1;
					if (mark[input[m]] != 1)
						count++;
				}
			} else
				check = false;
			if (check) {
				System.out.println(count);
			} else
				System.out.println(k);
		}
	}
}