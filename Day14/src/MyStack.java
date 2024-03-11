import java.util.*;

class GenericStack<T> {
	// ����: ���Լ���
	Object[] stack; 
	int cur;
	int capacity;
	
	// ������
	public GenericStack(int capacity) {
		this.cur = 0;
		this.capacity = capacity;
		stack = new Object[capacity];
	}
	
	// ���ÿ� ���� �߰� push
	public void push(T item) {
		if(cur == capacity) 
			return;
		stack[cur] = item;
		cur++;
	}
	
	// pop
	public T pop() {
		if(cur == 0)
			return null; // return Ÿ���� �־�� �� ��� null
		cur--;
		return (T)stack[cur];
	}
	
	// peek top
	public T peek() {
		if(cur == 0)
			return null;
		return (T)stack[cur-1];
	}
	
	public boolean empty() {
		return cur == 0;
	}
	
	public void printArray(T[] a) { // ������ �� ������ �� ��
		for(T i: a) {
			System.out.println(i);
		}
		
	}
}

public class MyStack {
	public static <T> GenericStack<T> reverse(GenericStack<T> st) {//���׸� �޼ҵ�
		GenericStack<T> gst = new GenericStack<T>(10);
		
		while(!st.empty()) {
			T tmp = st.pop();
			gst.push(tmp);
		}
		return gst;
	}
	
	
	public static void main(String[] args) {
		GenericStack<String> gs = new GenericStack<String>(10);
		
		gs.push("Python");
		gs.push("Java");
		gs.push("C++");
		System.out.println(gs.peek());
		
		GenericStack<String> gs2 = reverse(gs); // <- ���۷��� Ÿ���̶� ���� �� ����
		while(!gs2.empty()) {
			System.out.println(gs2.pop());
		}
		
		while(!gs.empty()) {
			System.out.println(gs2.pop());
		}
		
		
		
		
		GenericStack<Integer> gsi = new GenericStack<Integer>(10);
		gsi.push(100);
		gsi.push(200);
		gsi.push(300);
		
		System.out.println(gsi.peek());
		for(int i= 0; i<4 ;i++) {
			System.out.println(gsi.pop());
		}
		
		String[] sarr = {"Hello", "java"};
		gs.printArray(sarr);
		
	}

}
