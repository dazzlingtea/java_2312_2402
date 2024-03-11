
class GenericQueue<T> {
	Object[] q;
	int fcur, rcur;
	int capacity;
	
	public GenericQueue() {
		this(10);
	}
	public GenericQueue(int capacity) {
		this.capacity =  capacity;
		q = new Object[capacity];
	}
	public void push(T item) {
		if(rcur == capacity) 
			return;
		q[rcur] = item;
		rcur++;
	}
	public T pop() {
		if(fcur == rcur)
			return null;
		fcur++;
		return (T)q[fcur-1];
	}
	public T peek() {
		if(fcur == rcur)
			return null;
		return (T)q[fcur];
	}
	public T rear() {
		if(fcur == rcur)
			return null;
		return (T)q[rcur-1]; //rcur 위치에 들어가야 해서
	}
	public int size() {
		return rcur - fcur;
	}
	public boolean empty() {
		return fcur == rcur;
	}
	
}


public class MyQueue {
	static <T> GenericQueue<T> reverse(GenericQueue<T> gqt) {
		GenericQueue<T> rgq = new GenericQueue<T>();
		GenericStack<T> rst = new GenericStack<T>(10);
		
		while(!gqt.empty()) {
			rst.push(gqt.pop());
		}
		while(!rst.empty()) {
			rgq.push(rst.pop());
		}
		return rgq;
	}
	
	public static void main(String[] args) {
		
		GenericQueue<String> gqs = new GenericQueue<String>();
		
		gqs.push("apple");
		gqs.push("banana");
		gqs.push("orange");
		
		System.out.println(gqs.peek());
		System.out.println(gqs.rear());
		System.out.println(gqs.pop());
		System.out.println(gqs.size());
		
		while(!gqs.empty()) {
			System.out.println(gqs.pop());
		}
		
		gqs.push("python");
		gqs.push("java");
		gqs.push("c++");
		
		GenericQueue<String> gqs2 = reverse(gqs);
		while(!gqs2.empty()) {
			System.out.println(gqs2.pop());
		}
		

	}

}
