import java.util.*;
public class KiemTraDayNgoacDung {
	static boolean check(String a){
        Stack st = new Stack();
        
        for(int i = 0; i < a.length();i++){
            char c = a.charAt(i);
            if(c=='(' || c == '[' || c== '{'){
                st.push(c);
            }else{
                if(!st.empty()){
                    if(c == ')'){
                        if((char) st.peek() != '('){
                            return false;
                        }
                    }
                    if(c == ']'){
                        if((char) st.peek() != '['){
                            return false;
                        }
                    }
                    if(c == '}'){
                        if((char) st.peek() != '{'){
                            return false;
                        }
                    }
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty() == true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t = sc.nextInt();
        String s = sc.nextLine();
        
        while(t-- > 0){
            String a = sc.nextLine();
           
            if(check(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
