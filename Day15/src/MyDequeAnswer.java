class GenericDeque<T, S> {
	Object[] tArr, sArr;
	int capacity, fcur, rcur;
	
	public GenericDeque() {
		this(30);
	}
	public GenericDeque(int capacity) {
		this.capacity = capacity;
		this.fcur = capacity / 2;
		this.rcur = capacity / 2;
		this.tArr = new Object[capacity];
		this.sArr = new Object[capacity];
	}
	
	public void addFirst(T tVal, S sVal) {
		if(fcur == -1) return;
		tArr[fcur] = tVal;
		sArr[fcur] = sVal;
		fcur--;
	}
	public void addLast(T tVal, S sVal) {
		if(rcur == capacity) return;
		tArr[rcur] = tVal;
		sArr[rcur] = sVal;
		rcur++;
	}
	
	public T removeFirst1() {
		if(fcur == rcur) return null;
		T tVal = (T)tArr[fcur+1];
		fcur++;
		return tVal;
	}
	public S removeFirst2() {
		if(fcur == rcur) return null;
		S sVal = (S)sArr[fcur+1];
		fcur++;
		return sVal;
	}
	public T removeLast1() {
		if(fcur == rcur) return null;
		T tVal = (T)tArr[rcur-1];
		rcur--;
		return tVal;
	}
	public S removeLast2() {
		if(fcur == rcur) return null;
		S sVal = (S)sArr[rcur-1];
		rcur--;
		return sVal;
	}
	
	public T peek1() {
		return (T)tArr[fcur+1];
	}
	public S peek2() {
		return (S)sArr[fcur+1];
	}
	
	public T rear1() {
		return (T)tArr[rcur-1];
	}
	public S rear2() {
		return (S)sArr[rcur-1];
	}
	
	public int size() {
		return rcur - fcur;
	}
	public boolean empty() {
		return fcur == rcur;
	}
}

public class MyDequeAnswer {
	public static void main(String[] args) {
		GenericDeque<Integer,String> gq = new GenericDeque<Integer,String>();
		gq.addFirst(1, "C¾ð¾î");
		gq.addFirst(2, "C++");
		gq.addFirst(3, "Java");
		gq.addFirst(4, "Spring");
		gq.addLast(5, "React");
		gq.addLast(6, "JavaScript");
		gq.addLast(7, "Vue");
		
		System.out.println(gq.fcur + " ~ " + gq.rcur);
		System.out.println(gq.tArr[11] + " " + gq.sArr[11]);
		System.out.println(gq.tArr[12] + " " + gq.sArr[12]);
		System.out.println(gq.tArr[13] + " " + gq.sArr[13]);
		System.out.println(gq.tArr[14] + " " + gq.sArr[14]);
		System.out.println(gq.tArr[15] + " " + gq.sArr[15]);
		System.out.println(gq.tArr[16] + " " + gq.sArr[16]);
		System.out.println(gq.tArr[17] + " " + gq.sArr[17]);
		System.out.println(gq.tArr[18] + " " + gq.sArr[18]);
		System.out.println();
		
		System.out.println(gq.removeFirst1()); 
		System.out.println(gq.removeFirst2());
		System.out.println(gq.removeLast1());
		System.out.println(gq.removeLast2());
		System.out.println();
		
		System.out.println(gq.fcur + " ~ " + gq.rcur);
		System.out.println(gq.peek1() +" " +gq.peek2());
		System.out.println(gq.rear1() +" " +gq.rear2());
		System.out.println(gq.size() + " " +gq.empty());
		System.out.println();
		
		System.out.println(gq.tArr[12] + " " + gq.sArr[12]);
		System.out.println(gq.tArr[13] + " " + gq.sArr[13]);
		System.out.println(gq.tArr[14] + " " + gq.sArr[14]);
		System.out.println(gq.tArr[15] + " " + gq.sArr[15]);
		System.out.println(gq.tArr[16] + " " + gq.sArr[16]);
		System.out.println(gq.tArr[17] + " " + gq.sArr[17]);
		
	 }
}