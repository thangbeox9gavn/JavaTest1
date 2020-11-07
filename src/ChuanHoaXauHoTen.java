import java.util.*;

public class ChuanHoaXauHoTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		String n;
		t = sc.nextInt();
		n = sc.nextLine();
		while (t-- > 0) {
			n = sc.nextLine();
			n = n.trim();
			n = n.replaceAll("\\s+", " ");
			String str[] = n.split(" ");
			String newStr = "";
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length(); j++) {
					String s = "";
					if (j == 0) {
						s += String.valueOf(str[i].charAt(j)).toUpperCase();
					}else {
						s += String.valueOf(str[i].charAt(j)).toLowerCase();
					}
					newStr += s;
				}
				if (i < str.length - 1 ) {
					newStr += " ";
				}
			}
			System.out.println(newStr);
		}
	}
}
