import java.util.*;
public class SapXepDoiChoTrucTiep {
 	static void in(int a[],int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for(int i = 0; i< n;i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j< n;j++){
                if(a[i] > a[j]){
                    int x = a[j];
                    a[j] = a[i];
                    a[i] = x;
                }
            }
        	System.out.print("Buoc "+(i+1)+": ");
            in(a,n);
            if (isLast(a)) {
                return;
            }else {
                System.out.println("");
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
