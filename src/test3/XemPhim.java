package test3;

import java.util.Scanner;

public class XemPhim {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();

        int F[][] = new int[105][25005];
        int w[] = new int[105];

        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (w[i] <= j) {
                    F[i][j] = Math.max(F[i - 1][j], w[i] + F[i - 1][j - w[i]]);
                } else {
                    F[i][j] = F[i - 1][j];
                }
            }
        }

        System.out.println(F[n][c]);
    }
}
