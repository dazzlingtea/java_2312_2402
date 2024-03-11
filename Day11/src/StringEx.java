
public class StringEx {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		//¹®ÀÚ¹è¿­ -> ¹®ÀÚ¿­
		 char cArray[] = {'j', 'a', 'v', 'a'};
		 String s3 = new String(cArray);
		 System.out.println(s1+s2+s3);
		
		 String sA = "Hello";
		 String sB = "Java";
		 String sC = "Hello";
		
		 String sD = new String("Hello");
		 String sE = new String("Java");
		 String sF = new String("Hello");
		 
		 if(sA == sB) System.out.println("a == b"); //String°´Ã¼ ºñ±³´Â °ªÀÌ ³ª¿È
		 if(sA == sC) System.out.println("a == c");

		 if(sD == sE) System.out.println("d == e");
		 if(sD == sF) System.out.println("d == f");
		 
		 String s4 = "Hello Java!";
		 System.out.println(s4.charAt(6)); //0¹ø ~~
		 System.out.println(s4.codePointAt(7)); //ÀÎÅØ½º 7 ¹®ÀÚÀÇ À¯´ÏÄÚµå
		 
		 String s5 = "»ï°¢Çü";
		 System.out.println(s5.codePointAt(1));
		 System.out.println(s5.length());
		 
		 String s6a = "È«±æµ¿";
		 String s6b = "È«±æµ¿";
		 String s6c = "¹Úº¸°Ë";
		 String s6d = "È©±æµ¿";
		 String s6e = "ÃL±æµ¿";
		 String s6f = "È«ƒxµ¿";
		 String s6g = "È«±æµ¿Àü";
		 String s6h = "È«±æµ¿Àü±â";
		 System.out.println(s6a.compareTo(s6b));
		 System.out.println(s6a.compareTo(s6c));
		 System.out.println(s6a.compareTo(s6d)); //¤², ¤´, ¤µ, ¤¶
		 System.out.println(s6a.compareTo(s6e)); //ÇÑ Ä­ Â÷ÀÌ¶ó -1
		 System.out.println(s6a.compareTo(s6f)); //ÇÑ Ä­ Â÷ÀÌ¶ó -1
		 System.out.println(s6a.compareTo(s6g)); //ÇÑ ±ÛÀÚ Ãß°¡µÅ¼­
		 System.out.println(s6a.compareTo(s6h)); //ÇÑ ±ÛÀÚ ´õ Ãß°¡µÅ¼­
		 
		 String s7a = "abcd" + 1 + "efg" + true;
		 System.out.println(s7a);
		 String s7b = "abcd".concat("efg"); //¿ø·¡ abcd¸¦ abcdefg·Î ¿ÏÀüÈ÷ ±³Ã¼
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
		 String[] s9e = s9d.split("[gfh]"); //Á¤±ÔÆí½Ä: ÆÐÅÏ¿¡ ¸Â´Â °É Ã£¾Æ¶ó g ¶Ç´Â f ¶Ç´Â h
		 for(String i:s9e)
			 System.out.println(i);
		 
		 String[] s9f = s9d.split("[a-zA-Z°¡-ÆR]"); //a~z ÀüºÎ A-Z °¡-ÆR
		 for(String i:s9f)
			 System.out.println(i); //¼ýÀÚ¸¸ ³ª¿À°Ô µÊ
		 
		 String s10 = "              java  coding   "; //¾ÕµÚ¸¸!!
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
