
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		
		// ���ڿ� �߰� append
		sb.append(" language");
		System.out.println(sb);
		
		// ���ڿ� ��ü replace �����ε����� ������+1
		sb.replace(5, 9, "hello");
		System.out.println(sb);
		
		// oua ����
		sb.delete(9, 12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.length();
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //capacity() ��ü �뷮
		
		sb.setLength(5); //�������� ����
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("abcde12345abcde12345");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.delete(10, 19);
		System.out.println(sb); //length�� ������ capa�� �״����
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.insert(5, "java");
		System.out.println(sb);
		
	}

}
