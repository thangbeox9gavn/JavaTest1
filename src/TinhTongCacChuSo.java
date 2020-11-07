
import java.util.*;

public class TinhTongCacChuSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		int t;
		t = sc.nextInt();
		n = sc.nextLine();
		
		while (t-- > 0) {
			int sum = 0;
			n = sc.nextLine();
			char[] newStr = n.toCharArray();
			Arrays.sort(newStr);
			String sorted = new String(newStr);
			String nums = "";

			for (int i = 0; i < sorted.length(); i++) {
				if (sorted.charAt(i) >= '0' && sorted.charAt(i) <= '9') {
					sum += Integer.parseInt(String.valueOf(sorted.charAt(i)));
					nums += String.valueOf(sorted.charAt(i));
				}
			}
			
			String replace = sorted.replace(nums, "");
			System.out.println(replace+sum);
		}
	}
}
