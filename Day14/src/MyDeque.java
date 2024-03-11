class GenericDeque<T,S> {
	Object[] tArr, sArr;
	int capacity, fcur, rcur;
	
	public GenericDeque() {
		this(30);
		tArr = new Object[30];
		sArr = new Object[30];
		fcur = rcur = 15;
	}
	public GenericDeque(int capacity) {
		this.capacity = capacity;
		tArr = new Object[capacity];
		sArr = new Object[capacity];
		fcur = rcur = capacity / 2;
	}
	
	public void addFirst(T tVal, S sVal) {
		if(fcur == (rcur + 1) % capacity) return;
		fcur = (fcur - 1 + capacity) % capacity;
		tArr[fcur] = tVal;
		sArr[fcur] = sVal;
	}
	public void addLast(T tVal, S sVal) {
		if(fcur == (rcur + 1) % capacity) return;
		tArr[rcur] = tVal;
		sArr[rcur] = sVal;
		rcur = (rcur + 1) % capacity;
	}
	public T removeFirst1() {
		if(fcur == rcur) return null;
		T removedT = (T)tArr[fcur];
		S removedS = (S)sArr[fcur];
		fcur++;
		return removedT;
	}
	public S removeFirst2() {
		if(fcur == rcur) return null;
		T removedT = (T)tArr[fcur];
		S removedS = (S)sArr[fcur];
		fcur++;
		return removedS;
	}
	public T removeLast1() {
		if(fcur == rcur) return null;
		T removedT = (T)tArr[rcur-1]; 
		S removedS = (S)sArr[rcur-1]; 
		rcur--;
		return removedT;
	}
	public S removeLast2() {
		if(fcur == rcur) return null;
		T removedT = (T)tArr[rcur-1]; 
		S removedS = (S)sArr[rcur-1]; 
		rcur--;
		return removedS;
	}
	public T peek1() { return (T)tArr[fcur]; }
	public S peek2() { return (S)sArr[fcur]; }
	
	public T rear1() { return (T)tArr[rcur-1]; }
	public S rear2() { return (S)sArr[rcur-1]; }
		
	public int size() { return rcur - fcur; }
	public boolean empty() { return fcur == rcur; }
	
	public void printDeque(String s) {
        if (empty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = fcur; i < rcur; i++) {
            System.out.println(s + " " + tArr[i] + ", " + sArr[i]);
        }
    }
}


public class MyDeque {
	public static void main(String[] args) {
		GenericDeque<Integer, String> dq = new GenericDeque<Integer,String>();
		
		dq.addFirst(1, "python");
		dq.addFirst(2, "C¾ð¾î");
		dq.addLast(3, "Java");
		dq.addFirst(4, "C++");
		dq.addLast(5, "JavaScript");
		dq.addLast(6, "Kotlin");
		dq.addLast(7, "Spring");
		dq.addLast(8, "React");
		
		dq.printDeque("add");
		System.out.println();
		
		System.out.println("removeFirst1 "+dq.removeFirst1());
		System.out.println("removeFirst2 "+dq.removeFirst2());
		System.out.println("removeLast1 "+dq.removeLast1());
		System.out.println("removeLast2 "+dq.removeLast2());
		System.out.println();
		
		dq.printDeque("after remove :");
		
		System.out.println("peek1 "+dq.peek1());
		System.out.println("peek2 "+dq.peek2());
		System.out.println("rear1 "+dq.rear1());
		System.out.println("rear2 "+dq.rear2());
		System.out.println();
		
		System.out.println("size "+dq.size());
		System.out.println("empty "+dq.empty());
		
		while(!dq.empty()) {
			dq.removeFirst1();
		}
		
		System.out.println("empty "+dq.empty());
	}

}
