import java.util.*;
public class NhamChuSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);

		int sum1 = 0;
		int sum2 = 0;
		if (str1.contains("6")) {
			String s1 = str1.replace("6","5");
			sum1 += Integer.parseInt(s1);
		}else {
			sum1 += a;
		}
		if (str2.contains("6")) {
			String s2 = str2.replace("6","5");
			sum1 += Integer.parseInt(s2);
		}else {
			sum1 += b;
		}
		
		if (str1.contains("5")) {
			String s1 = str1.replace("5","6");
			sum2 += Integer.parseInt(s1);
		}else {
			sum2 += a;
		}
		if (str2.contains("5")) {
			String s2 = str2.replace("5","6");
			sum2 += Integer.parseInt(s2);
		}else{
			sum2 += b;
		}
		
		
		System.out.println(sum1 +" "+ sum2);
	}
}
