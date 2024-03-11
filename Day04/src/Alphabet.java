
public class Alphabet {

	public static void main(String[] args) {
		// a~z까지 출력 a 유니코드는 97번 z 122번
		//for
		
		for(int i = 97 ; i < 123 ; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		//while
		int j = 97;  // 초기식이 없으니까 처음에 정의
		while(j <= 122) {
			System.out.println((char)j);
			j++;
		}
		//do-while
		char k = 'a';
		do {
			System.out.println(k);
			k++;  //char도 정수처럼 증감 가능
		} while(k <= 'z');   
		
		
		
		
	}

}
