import java.util.*;
public class DayXauFibonaci {
	static long F[] = new long[100];
    public static void main(String[] args) {
        F[0] = 0;
        F[1] = 1;
        for(int i = 2; i <=92;i++){
            F[i] = F[i-1]+F[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int n,t; long k;
        t = sc.nextInt();
        while(t-- >0){
            n= sc.nextInt();
            k=sc.nextLong();
            System.out.println(tim(n,k));
        }
    }
    static char tim(int n, long k){
        if(n ==1) return 'A';
        if(n==2) return 'B';
        if(k<=F[n-2]) return tim(n-2,k);
        return tim(n-1, k-F[n-2]);
    }
}
