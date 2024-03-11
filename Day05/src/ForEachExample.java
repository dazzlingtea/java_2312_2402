import java.util.Scanner;
public class ForEachExample {
	enum Week {��,ȭ,��,��,��,��,��}; //���� �޼ҵ� �ۿ� ��ߵ�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = {1, 2, 3, 4, 5};
		
		for(int i=0 ; i<n.length ; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
		for(int i: n) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		String fruit[] = new String[5];
		for(int i=0 ; i<fruit.length ; i++) {//�Է¹����� for-each ���� �� ��
			fruit[i] = sc.nextLine();
		}
		for(String s: fruit) { //for-each�� �����ö��� ����
			System.out.println(s);
		}
		
		   //���� Week��� Ÿ���� ����
		for(Week day: Week.values())
			System.out.print(day +" ");
		System.out.println(Week.��);
		System.out.println(Week.valueOf("��"));
	}

}
