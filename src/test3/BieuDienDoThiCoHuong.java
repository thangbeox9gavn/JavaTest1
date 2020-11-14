package test3;
import java.util.*;
public class BieuDienDoThiCoHuong {
	static LinkedList<Integer>[] list;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int m = in.nextInt();
            list = new LinkedList[n + 1];
            for (int i = 1; i <= n; i++) {
                list[i] = new LinkedList<Integer>();
            }
            for (int i = 1; i <= m; i++) {
                int q = in.nextInt();
                int k = in.nextInt();
                list[q].add(k);
            }
            for (int i = 1; i <= n; i++) {
                int size = list[i].size();
                System.out.print(i+": ");
                for (int j = 0; j < size; j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
