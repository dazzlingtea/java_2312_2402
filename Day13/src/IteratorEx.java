import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
		}
		
		it =v.iterator(); //커서가 처음으로 다시 돌아감
		int sum = 0;
		while(it.hasNext()) {
			sum += it.next();
		}
		System.out.println(sum);
		
	}

}
