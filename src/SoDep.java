
import java.util.*;

public class SoDep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		String n;
		t = sc.nextInt();
		n = sc.nextLine();
		while (t-- > 0) {
			n = sc.nextLine();
			if (isReverse(n) && isEven(n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean isReverse(String n) {
		String str[] = n.split("");
		for (int i = 0; i < str.length/2; i++) {
			if(Integer.parseInt(str[i]) != Integer.parseInt(str[str.length - 1 - i])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(String n) {
		String str[] = n.split("");
		
		for (int i = 0; i < str.length; i++) {
			if (Integer.parseInt(str[i]) % 2 != 0) {
				return false;
			}
		}
		
		return true;
	}
}
