import  java.util.*;

public class QueueEx {
	public static void main(String[] args) {
//		Queue<Integer> q = new Queue<Integer>(); �������̽��� �� ����
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(2);
		q.offer(3);
		
		System.out.println(q.poll());// �������
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll()); //null
//		System.out.println(q.remove()); ������¿��� �����ϸ� �ͼ���
		System.out.println(q.isEmpty());
		
		q.add(1);
		q.add(2);
		q.offer(3);
		
		System.out.println(q.peek());
		System.out.println(q.element()); // �ͼ���
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		
		System.out.println(q.contains(3));
		System.out.println(q.contains(4));
	}

}
