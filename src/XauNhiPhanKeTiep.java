import java.util.*;
public class XauNhiPhanKeTiep {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- >0) {            
            String n = sc.next();
            xauKeTiep(n);
           
        }
    }
    
    public static void xauKeTiep(String n){
        StringBuilder sb = new StringBuilder(n);
        int i = n.length() - 1;
        while (n.charAt(i) == '1' && i >=0) {            
            sb.setCharAt(i, '0');
            i--;
        }
        if (i >=0 ) {
            sb.setCharAt(i, '1');
        }
        System.out.println(sb.toString());
    }
}
