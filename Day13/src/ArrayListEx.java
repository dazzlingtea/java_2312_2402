import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("kim");
		al.add("hong");
		al.add("james");
		al.add("america");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.remove(1);
		al.remove("kim");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.add(1, "john");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		} //가변형이라  capacity 없음
		System.out.println(al.contains("america"));
		
		Object o[] = al.toArray();
		for(Object s: o) {
			String ss = (String)s; //downcasting
			System.out.println(ss);
		}
		
	}
	

}
