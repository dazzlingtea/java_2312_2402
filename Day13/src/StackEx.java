import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);

		System.out.println(st.peek()); //가장 최근에 들어온 요소
		
		System.out.println(st.pop());
		System.out.println(st.peek()); //3 빠져서 2
		
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(1);
		// 1 2 3 1 <- peek
		System.out.println(st.search(3)); //peek으로부터 몇 번째에 pop?
		System.out.println(st.search(1)); 
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.empty());
		System.out.println(st.pop()); //Exception in thread "main" java.util.EmptyStackException
	}

}
