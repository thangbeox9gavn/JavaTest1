
import java.util.*;

public class DiaChiEmail {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t;
		String n;
		t = sc.nextInt();
		n = sc.nextLine();
		List<String> list = new ArrayList<String>();
		while (t-- > 0) {
			n = sc.nextLine();
			chuanHoa(n,list);
		}
	}
	
	public static void chuanHoa(String n, List<String> list) {
		n = n.trim();
		n = n.replaceAll("\\s+", " ");
		String str[] = n.split(" ");
		String newStr = "";
		for (int j = 0; j < str[str.length - 1].length(); j++) {
			newStr += String.valueOf(str[str.length - 1].charAt(j)).toLowerCase();
		}
		
		for (int i = 0; i < str.length - 1; i++) {
			newStr += String.valueOf(str[i].charAt(0)).toLowerCase();
		}
		list.add(newStr);
		int count = 0;
		if (!list.isEmpty()) {
			for (String s : list) {
				if (s.equals(newStr)) {
					count++;
				}
			}
		}
		if (count > 1 ) newStr += String.valueOf(count);
		
		System.out.println(newStr+"@ptit.edu.vn");
	}
	
}
