
public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("while");
		while(i < 0) {  //������ �� ������ �ƿ� ������ �ȵǼ� ���� �ο��Ϸ� �Ѿ
			System.out.println(i);
			i++; //�̰� ������ ��� i=0�̶� ���ѷ����� ����
		}
		
		int j = 0;
		System.out.println("do-while");
		do {
			System.out.println(j);
			j++;
		} while(j < 0);
		
	}

}
