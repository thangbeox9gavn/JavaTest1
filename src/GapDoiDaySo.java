import java.util.*;
public class GapDoiDaySo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,t; long k;
        t = sc.nextInt();
        while(t-- >0){
            n= sc.nextInt();
            k=sc.nextLong();
            System.out.println(tim(n,k));
        }
    }
    static long tim(int n, long k){
        long x = (long)Math.pow(2,n-1);
        if(k ==x) return n;
        if(k<x) return tim(n-1,k);
        return tim(n-1,k-x);
    }
}
