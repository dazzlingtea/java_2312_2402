import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		//var hm = new HashMap<String,String>(); 로 줄여 쓴 방법이 있음
		hm.put("C++", "씨쁠쁠");
		hm.put("Java", "자바");
		hm.put("Python", "파이썬");
		
		System.out.println(hm.get("Python"));
		hm.remove("C++"); //삭제 시 키만 쓰면 됨
		System.out.println(hm.get("C++")); // null
		
		System.out.println(hm.containsKey("Java"));
		System.out.println(hm.containsValue("파이썬"));
		
		hm.put("Python", "파이선");
		System.out.println(hm.get("Python")); //파이선으로 바뀜
		
		Set<String> ks = hm.keySet(); //키 집합
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
