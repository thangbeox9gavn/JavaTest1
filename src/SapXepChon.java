import java.util.*;
public class SapXepChon {
	static void in(int a[], int n) {
        for (int i = 0; i < n; i++) {
        	System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int min = a[i], index = i;
            for (int j = i; j < n; j++) {
                if (min > a[j]) {
                	index = j;
                	min = a[j];
                }			
            }
            int x = a[i];
            a[i] = a[index];
            a[index] = x;
            System.out.print("Buoc "+(i+1)+": ");
            in(a,n);
            if (isLast(a)) {
                return;
            }else {
                System.out.println();
            }
        }
    }
    private static boolean isLast(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
