import java.util.*;

public class LinkedListEx {
	static void printList(LinkedList<String> ll) {
		Iterator<String> it = ll.iterator();//////////////////
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList<String> city = new LinkedList<String>();
		
		city.add("����");	
		city.add("���");	
		city.add("�ϳ�");	
		city.add(2, "����");	
		city.add(0, "��õ");	
		
		printList(city);
		Collections.sort(city);
		printList(city);
		
		Collections.reverse(city);
		printList(city);
		
		String m = Collections.max(city);
		System.out.println(m);
		
		String n = Collections.min(city);
		System.out.println(n);
	}

}
