import java.util.*;

public class StackSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		
		
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			
			if(n == 0) st.pop();
			else if(1 <= n && n < 10) st.push(n);
		}
		String ans = "";
		while(!st.empty()) {
			int peek = st.peek();
			ans += Integer.toString(peek);
			st.pop();
		}
		System.out.println(ans);

	}

}
