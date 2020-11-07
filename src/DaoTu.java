import java.util.*;

public class DaoTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String n = sc.nextLine();
			System.out.println(reverse(n));
		}
	}

	static String reverse(String input) {
		String[] s = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			byte[] strAsByteArray = s[i].getBytes();

			byte[] result = new byte[strAsByteArray.length];

			for (int j = 0; j < strAsByteArray.length; j++)
				result[j] = strAsByteArray[strAsByteArray.length - j - 1];
			if (i != s.length - 1) {
				sb.append(new String(result));
				sb.append(" ");
			} else {
				sb.append(new String(result));
			}

		}

		return sb.toString();
	}
}
