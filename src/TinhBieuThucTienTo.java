import java.util.*;
public class TinhBieuThucTienTo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            System.out.println(evaluatePrefix(n));
        }
    }
  
    static int evaluatePrefix(String exprsn) 
    { 
        Stack<Integer> Stack = new Stack<Integer>(); 
  
        for (int j = exprsn.length() - 1; j >= 0; j--) { 
  
            if (Character.isDigit(exprsn.charAt(j))) 
                Stack.push(exprsn.charAt(j) - '0'); 
  
            else { 
  
                int o1 = Stack.peek(); 
                Stack.pop(); 
                int o2 = Stack.peek(); 
                Stack.pop(); 

                switch (exprsn.charAt(j)) { 
                case '+': 
                    Stack.push(o1 + o2); 
                    break; 
                case '-': 
                    Stack.push(o1 - o2); 
                    break; 
                case '*': 
                    Stack.push(o1 * o2); 
                    break; 
                case '/': 
                    Stack.push(o1 / o2); 
                    break; 
                } 
            } 
        } 
  
        return Stack.peek(); 
    } 
}
