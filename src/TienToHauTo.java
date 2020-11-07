import java.util.*;
public class TienToHauTo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {            
            String n = sc.nextLine();
            System.out.println(preToPost(n));
        }
        
    }
    static boolean isOperator(char x) {
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    
    static String preToPost(String pre) {
        Stack<String> s = new Stack<String>();
        
        for (int i = pre.length() - 1; i >= 0; i--) {
            if (isOperator(pre.charAt(i))) {
                String op1 = s.peek(); 
                s.pop();
                String op2 = s.peek();
                s.pop();
                
                String temp = op1 + op2 + pre.charAt(i);
                s.push(temp);
            }else{ 
                s.push( pre.charAt(i)+""); 
            } 
        }
        return s.peek();
    }
}
