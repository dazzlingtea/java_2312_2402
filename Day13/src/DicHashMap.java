import java.util.*;
public class DicHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
		String k = sc.next();
		String v = sc.next();
		hm.put(k, v);
		// hm.put(sc.next(), sc.next())
		}
		
		String input = sc.next();
		if(hm.containsKey(input)) System.out.println(hm.get(input));
		else System.out.println("존재하지 않습니다");
		//String ans = hm.get(sc.next());
		//if(ans == null) System.out.println("존재하지 않습니다");
		//else System.out.println(ans);
	}

}
