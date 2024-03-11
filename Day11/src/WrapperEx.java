

public class WrapperEx {
	public static void main(String[] args) {
		int i1 = 10;
		Integer i2 = Integer.valueOf(10); // new 쓸 필요 없음
//		Integer i3 = new Integer(10); 가능은 한데 쓰지 마라
		Integer i4 = Integer.valueOf("10");
		Integer i5 = Integer.valueOf("11", 2); //11을 2진수로 보고 10진수로
		System.out.println(i2);
		System.out.println(i4);
		System.out.println(i5);
		
		int i6 = i4.intValue();
		short i7 = i4.shortValue();
		long i8 = i4.longValue();
		float i9 = i4.floatValue();
		double i10 = i4.doubleValue();
		byte i11 = i4.byteValue();
		
		String s1 = "1004";
		int i12 = Integer.parseInt(s1);
		System.out.println(i12);
		System.out.println(Integer.parseInt(s1, 5));
		
		
		System.out.println(Integer.toBinaryString(31));
		System.out.println(Integer.toOctalString(31));
		System.out.println(Integer.toHexString(31));
		
		
		char c1 ='a';
		Character c2 = Character.valueOf('a'); //.valueOf('a') static메소드구나
		
		boolean b1 = true;
		Boolean b2 = Boolean.valueOf(true);
		System.out.println(Boolean.parseBoolean("false"));
		
		double d1 = Double.parseDouble("3.14");
		System.out.println(d1);
		
//		double d2 = Double.parseDouble("false"); 
		//java.lang.NumberFormatException
//		System.out.println(d2);
		
		boolean b3 = Boolean.parseBoolean("1");
		System.out.println(b3);
		boolean b4 = Boolean.parseBoolean("0");
		System.out.println(b4);
		
		
//		int i13 = Integer.parseInt("3.14");
//		NumberFormatException
//		System.out.println(i13);
		
		double d3 = Double.parseDouble("3");
		System.out.println(d3);
		
		
		char c3 = '1';
		if(Character.isAlphabetic(c3)) 
			System.out.println(c3 + "는 알파벳");
		
		if(Character.isDigit(c3)) 
			System.out.println(c3 + "는 숫자");
		
		char c4 = 'a';
		System.out.println(Character.toUpperCase(c4));
		
		int i14 = 62;
		String i14s = Integer.toBinaryString(i14);
		System.out.println(i14s);
		System.out.println(Integer.bitCount(i14)); //비트를 세라-> 1이 몇갠지
		
		Integer i100 = Integer.valueOf(100);
		Integer i101 = 101; //auto boxing (JDK 1.5)
		
		
		int i200 = i100.intValue(); //원래
		int i201 = i101; //auto unboxing
		System.out.println(i200);
		System.out.println(i201);
	}

}
