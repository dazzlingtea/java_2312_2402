
public class StringEx {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		//문자배열 -> 문자열
		 char cArray[] = {'j', 'a', 'v', 'a'};
		 String s3 = new String(cArray);
		 System.out.println(s1+s2+s3);
		
		 String sA = "Hello";
		 String sB = "Java";
		 String sC = "Hello";
		
		 String sD = new String("Hello");
		 String sE = new String("Java");
		 String sF = new String("Hello");
		 
		 if(sA == sB) System.out.println("a == b"); //String객체 비교는 값이 나옴
		 if(sA == sC) System.out.println("a == c");

		 if(sD == sE) System.out.println("d == e");
		 if(sD == sF) System.out.println("d == f");
		 
		 String s4 = "Hello Java!";
		 System.out.println(s4.charAt(6)); //0번 ~~
		 System.out.println(s4.codePointAt(7)); //인텍스 7 문자의 유니코드
		 
		 String s5 = "삼각형";
		 System.out.println(s5.codePointAt(1));
		 System.out.println(s5.length());
		 
		 String s6a = "홍길동";
		 String s6b = "홍길동";
		 String s6c = "박보검";
		 String s6d = "홉길동";
		 String s6e = "홎길동";
		 String s6f = "홍긹동";
		 String s6g = "홍길동전";
		 String s6h = "홍길동전기";
		 System.out.println(s6a.compareTo(s6b));
		 System.out.println(s6a.compareTo(s6c));
		 System.out.println(s6a.compareTo(s6d)); //ㅂ, ㅄ, ㅅ, ㅆ
		 System.out.println(s6a.compareTo(s6e)); //한 칸 차이라 -1
		 System.out.println(s6a.compareTo(s6f)); //한 칸 차이라 -1
		 System.out.println(s6a.compareTo(s6g)); //한 글자 추가돼서
		 System.out.println(s6a.compareTo(s6h)); //한 글자 더 추가돼서
		 
		 String s7a = "abcd" + 1 + "efg" + true;
		 System.out.println(s7a);
		 String s7b = "abcd".concat("efg"); //원래 abcd를 abcdefg로 완전히 교체
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
		 String[] s9e = s9d.split("[gfh]"); //정규편식: 패턴에 맞는 걸 찾아라 g 또는 f 또는 h
		 for(String i:s9e)
			 System.out.println(i);
		 
		 String[] s9f = s9d.split("[a-zA-Z가-힣]"); //a~z 전부 A-Z 가-힣
		 for(String i:s9f)
			 System.out.println(i); //숫자만 나오게 됨
		 
		 String s10 = "              java  coding   "; //앞뒤만!!
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
