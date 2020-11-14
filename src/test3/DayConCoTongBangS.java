package test3;
import java.util.*;
public class DayConCoTongBangS {
	static int a[] = new int[1001];
    static int F[] = new int[1001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            F[i] = 1;
            for (int j = 1; j < i; j++) {
                if (a[j] < a[i]) {
                    F[i] = Math.max(F[i], F[j] + 1);
                }
            }

            ans = Math.max(ans, F[i]);
        }
        System.out.println(ans);
    }
}
