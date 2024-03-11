
public class ArrayPassing {
	static void changeSpace(char a[], int b) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') //a배열 i번째가 공백이면 !로 변경
				a[i] = '!';
		}
		b = 5;
	}
	
	static void printArray(char a[], int b) {
		for(char i: a) {
			System.out.print(i);
		}
		System.out.println(b);
	}
	public static void main(String[] args) {
		char c[] = "Hello Java Programming".toCharArray();
		int a = 2;
		
		printArray(c, a);  //cbv라서 2 b=5여도 안 바뀜
		changeSpace(c, a);
		printArray(c, a);
	}

}
