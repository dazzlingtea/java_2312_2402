
public class StringEx {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		//���ڹ迭 -> ���ڿ�
		 char cArray[] = {'j', 'a', 'v', 'a'};
		 String s3 = new String(cArray);
		 System.out.println(s1+s2+s3);
		
		 String sA = "Hello";
		 String sB = "Java";
		 String sC = "Hello";
		
		 String sD = new String("Hello");
		 String sE = new String("Java");
		 String sF = new String("Hello");
		 
		 if(sA == sB) System.out.println("a == b"); //String��ü �񱳴� ���� ����
		 if(sA == sC) System.out.println("a == c");

		 if(sD == sE) System.out.println("d == e");
		 if(sD == sF) System.out.println("d == f");
		 
		 String s4 = "Hello Java!";
		 System.out.println(s4.charAt(6)); //0�� ~~
		 System.out.println(s4.codePointAt(7)); //���ؽ� 7 ������ �����ڵ�
		 
		 String s5 = "�ﰢ��";
		 System.out.println(s5.codePointAt(1));
		 System.out.println(s5.length());
		 
		 String s6a = "ȫ�浿";
		 String s6b = "ȫ�浿";
		 String s6c = "�ں���";
		 String s6d = "ȩ�浿";
		 String s6e = "�L�浿";
		 String s6f = "ȫ�x��";
		 String s6g = "ȫ�浿��";
		 String s6h = "ȫ�浿����";
		 System.out.println(s6a.compareTo(s6b));
		 System.out.println(s6a.compareTo(s6c));
		 System.out.println(s6a.compareTo(s6d)); //��, ��, ��, ��
		 System.out.println(s6a.compareTo(s6e)); //�� ĭ ���̶� -1
		 System.out.println(s6a.compareTo(s6f)); //�� ĭ ���̶� -1
		 System.out.println(s6a.compareTo(s6g)); //�� ���� �߰��ż�
		 System.out.println(s6a.compareTo(s6h)); //�� ���� �� �߰��ż�
		 
		 String s7a = "abcd" + 1 + "efg" + true;
		 System.out.println(s7a);
		 String s7b = "abcd".concat("efg"); //���� abcd�� abcdefg�� ������ ��ü
		 System.out.println(s7b);
		 
		 String s8a = "Hello Java";
		 String s8b = s8a.replace("Java", "C++");
		 
		 String s8c = "Hello Java Java";
		 String s8d = s8c.replace("Java", "C++");
		 System.out.println(s8d);
		 
		 String s8e = "Hello Java Java";
		 String s8f = s8e.replaceFirst("Java", "C++");
		 System.out.println(s8f);
		 
		 String s8g = "Hello Java Java";
		 String s8h = s8e.replaceAll("Java", "C++");
		 System.out.println(s8h);
		 
		 String s9a = "Hello I like Java";
		 String[] s9b = s9a.split(" ");
		 for(String i:s9b)
			 System.out.println(i);
		 
		 String[] s9c = s9a.split("l");
		 for(String i:s9c)
			 System.out.println(i);
		 
		 String s9d = "aq890p2a0erf7r";
		 String[] s9e = s9d.split("[gfh]"); //�������: ���Ͽ� �´� �� ã�ƶ� g �Ǵ� f �Ǵ� h
		 for(String i:s9e)
			 System.out.println(i);
		 
		 String[] s9f = s9d.split("[a-zA-Z��-�R]"); //a~z ���� A-Z ��-�R
		 for(String i:s9f)
			 System.out.println(i); //���ڸ� ������ ��
		 
		 String s10 = "              java  coding   "; //�յڸ�!!
		 System.out.println(s10.trim());
		 
		 String s11 = "jaVa Is fUN!";
		 System.out.println(s11.toLowerCase());
		 System.out.println(s11.toUpperCase());
		 
		 String s12 = "Programming is fun!";
		 System.out.println(s12.substring(3));
		 System.out.println(s12.substring(3, 10));
		 System.out.println(s12.subSequence(3, 11));
		 
	}

}
