
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		
		// 문자열 추가 append
		sb.append(" language");
		System.out.println(sb);
		
		// 문자열 교체 replace 종료인덱스는 마지막+1
		sb.replace(5, 9, "hello");
		System.out.println(sb);
		
		// oua 삭제
		sb.delete(9, 12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.length();
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //capacity() 전체 용량
		
		sb.setLength(5); //기존보다 작음
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("abcde12345abcde12345");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.delete(10, 19);
		System.out.println(sb); //length는 줄지만 capa는 그대로임
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.insert(5, "java");
		System.out.println(sb);
		
	}

}
