
public class Alphabet {

	public static void main(String[] args) {
		// a~z���� ��� a �����ڵ�� 97�� z 122��
		//for
		
		for(int i = 97 ; i < 123 ; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		//while
		int j = 97;  // �ʱ���� �����ϱ� ó���� ����
		while(j <= 122) {
			System.out.println((char)j);
			j++;
		}
		//do-while
		char k = 'a';
		do {
			System.out.println(k);
			k++;  //char�� ����ó�� ���� ����
		} while(k <= 'z');   
		
		
		
		
	}

}
