import java.util.*;
class Prob5Point {
	private int x, y;
	public Prob5Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+this.x+", "+this.y+")";
	}
	public boolean equals(Object obj) {
//		Prob5Point
		return true;
	}
}

public class Assignment11Answer
{// �ڼ��� �� Ŭ�����뿡 �÷��ֽô� ��� ����
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
        // 2. Wrapper Ŭ������ �ٷ�� �����Դϴ�. ���� �°� �ڵ带 �ۼ����ּ���.
        // 2-1. ���� 20�� ���ڿ� ���� s1�� "20"���� �������ּ���.
    	//Integer.toString
        // 2-2. ���ڿ� "3.14"�� double Ÿ�� ���� d22�� �Ǽ� 3.14�� �������ּ���.
    	//Double.parseDouble(���ڿ�)
        // 2-3. ���ڿ� "true"�� boolean Ÿ�� ���� b23�� true�� �������ּ���.
    	//Boolean.parseBoolean(���ڿ�)
        // 2-4. ���� 30�� ������ ���ڿ��� ��ȯ�� s24�� �������ּ���.
    	//Integer.toBinaryString(30)
       
        // 3. ���� �ڵ��� �������� �� ������ ���� �������ּ���.
        // ����1: ���ͷ� ���̺� ������ �Ǳ� ������ true�� ���´�.
        // ����2: ��(heap) ������ ������ �Ǳ� ������ �ٸ� �ּҰ� �Ǿ� false�� ���´�.
        String s31 = "�ڹ�"; // true
        System.out.println(s31 == "�ڹ�");
        String s32 = new String(s31); //false
        System.out.println(s31 == s32);
       
        // 4. ���� �ڵ� �� auto boxing�� auto unboxing �ִ� ���� ���ÿ�.
        Double d41 = 3.14; // 1 auto boxing Wrapper Ŭ���� ���� �Ϲ� ������ �����ϰ� ����
        double d42 = d41; // 2 auto unboxing Wrapper Ŭ���� ������ �⺻ ������ �־ ��ڽ�
        System.out.println(3 + Integer.valueOf(5)); // 3 + Wrapper -> �⺻ auto unboxing
        if('c' == Character.valueOf('c')) // 4 auto unboxing
            System.out.println("c!");

        // 5. �Ʒ� �ڵ带 ��������� �� ������ ���� ��µǵ��� Prob5Point Ŭ������ �ۼ��ϼ���.
        // <��� ���>
        // Point(3, 5);
        // �ٸ� ��
        Prob5Point p51 = new Prob5Point(3, 5);
        Prob5Point p52 = new Prob5Point(6, 4);
        System.out.println(p51);
        if(p51.equals(p52)) System.out.println("���� ��");
        else System.out.println("�ٸ� ��");
       
        // 6. Scanner�� �̿��Ͽ� �� ���� �о� �������� �и��� ������ �� �� �� ����
        // ���ϴ� ���α׷��� �����, "����"�� �Է��ϸ� ����ǵ��� �ϴ� �ڵ带 �ۼ��ϼ���.
        // <����>
        // ������ �Է��ϼ��� > Java is fun.
        // ������ ���� 3�Դϴ�.
        // ������ �Է��ϼ��� > I like to write codes.
        // ������ ���� 5�Դϴ�.
        // ������ �Է��ϼ��� > ����
       while(true ) {
    	   System.out.println("������ �Է��ϼ��� > ");
    	   String input = sc.nextLine();
    	   if(input.equals("����")) break;
    	   String[] inputArray = input.split(" ");
    	   System.out.println("������ ���� "+inputArray.length + "�Դϴ�.");
       }
    }
}