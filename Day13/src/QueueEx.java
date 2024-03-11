import  java.util.*;

public class QueueEx {
	public static void main(String[] args) {
//		Queue<Integer> q = new Queue<Integer>(); 인터페이스라 못 만듬
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(2);
		q.offer(3);
		
		System.out.println(q.poll());// 순서대로
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll()); //null
//		System.out.println(q.remove()); 공백상태에서 삭제하면 익셉션
		System.out.println(q.isEmpty());
		
		q.add(1);
		q.add(2);
		q.offer(3);
		
		System.out.println(q.peek());
		System.out.println(q.element()); // 익셉션
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		
		System.out.println(q.contains(3));
		System.out.println(q.contains(4));
	}

}
