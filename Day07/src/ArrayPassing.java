
public class ArrayPassing {
	static void changeSpace(char a[], int b) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == ' ') //a�迭 i��°�� �����̸� !�� ����
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
		
		printArray(c, a);  //cbv�� 2 b=5���� �� �ٲ�
		changeSpace(c, a);
		printArray(c, a);
	}

}
