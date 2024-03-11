
public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("while");
		while(i < 0) {  //조건이 안 맞으면 아예 실행이 안되서 다음 두와일로 넘어감
			System.out.println(i);
			i++; //이거 빠지면 계속 i=0이라 무한루프에 빠짐
		}
		
		int j = 0;
		System.out.println("do-while");
		do {
			System.out.println(j);
			j++;
		} while(j < 0);
		
	}

}
