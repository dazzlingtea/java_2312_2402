import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		//var hm = new HashMap<String,String>(); �� �ٿ� �� ����� ����
		hm.put("C++", "���ܻ�");
		hm.put("Java", "�ڹ�");
		hm.put("Python", "���̽�");
		
		System.out.println(hm.get("Python"));
		hm.remove("C++"); //���� �� Ű�� ���� ��
		System.out.println(hm.get("C++")); // null
		
		System.out.println(hm.containsKey("Java"));
		System.out.println(hm.containsValue("���̽�"));
		
		hm.put("Python", "���̼�");
		System.out.println(hm.get("Python")); //���̼����� �ٲ�
		
		Set<String> ks = hm.keySet(); //Ű ����
		for(String s: ks) {
			System.out.println(s);
		}
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
	}

}
