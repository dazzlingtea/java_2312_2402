class Char {
	static boolean isAlphabet(char c) {
		int i = (int)c;
		// 65 ~ 90
		boolean isUpper = 65 < i && i<= 90;
		// 97 ~ 122
		boolean isLower =  97 <= i && i< 122;
		return isUpper || isLower;
	}
	static char toUpperCase(char c) {
		int i = (int)c;
		if(97<= i && i <= 122)
			return (char)(i-32);
		return c;
	}
}


public class CharacterApp {
	public static void main(String[] args) {
		System.out.println(Char.isAlphabet('a'));
		System.out.println(Char.isAlphabet('1'));
		System.out.println(Char.isAlphabet('C'));
		
		System.out.println(Char.toUpperCase('f'));
		System.out.println(Char.toUpperCase('Y'));
		System.out.println(Char.toUpperCase('3'));
	}

}
