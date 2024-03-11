import java.util.*;

public class TokenizerCalc {
	public static void main(String[] args) {
		String query = "100+200+300+400+500";
		StringTokenizer st = new StringTokenizer(query, "+");
		
		int sum=0;
		while(st.hasMoreTokens()) {//String current = st.nextToken(); ...
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(query+"="+sum);
		
		//for문은 countTokens() 사용, hasmore 필요 없음
	}

}
