import java.util.Scanner;
import java.util.InputMismatchException;

class Samp {
    int id;
    public Samp(int x) {
        this.id = x;
    }
    public Samp() {
    	this(0);
        System.out.println("������ ȣ��");
    }
}

class Samp2 {
    int x;
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public Samp2(int x) {
        this.x = x;
    }
}

class TV {
	String company;
	int year;
	int size;
	
	public TV(String company, int year, int size) {
		//���� ������
	}
	
	public void explain() {
		System.out.println(this.company +"���� ����"
						+this.year);
	}
}

class Grade {
	int a, b, c;
	
	public Grade(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void getAverage() {
		System.out.println("����� " + (this.a + this.b + this.c)/3);
	}
}


public class Assignment6Answer
{
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in); //�����ڴ� System.in�� �޴´�
        // 2. �Ʒ� �ڵ�� 2���� ������ �Է¹޾� ���� ���ϴ� �ڵ��Դϴ�.
        // 10�� 5�� �Է��Ѵٸ� ���������� 50�� ��µ˴ϴ�.
        // �׷��� 2.5�� 4�� �Է��Ѵٸ� java.util.InputMismatchException ���ܰ� �߻��մϴ�.
        // �� ���ܸ� ó���Ͽ� 2.5�� 4�� ���´ٸ� "�Ǽ��� �Է��ϸ� �ȵ˴ϴ�." ��� ������ ��������
        // �ڵ带 �������ּ���.
    	try {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
    	}
    	catch(InputMismatchException e) {
    		System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
    	}
        // 3. ���� Samp Ŭ���� �ڵ忡�� �߸��� �κ��� 3���� ��ģ ��, �Ʒ��� ��ģ �κ��� �ۼ����ּ���.
        // 1) �����ڿ� void �����
        // 2) �����ڿ� void �����
        // 3) this(0)�� ù ��° �ٷ� �ű��
       
        // 4. ���� Samp2 Ŭ���� �ڵ�� �Ʒ� �ڵ带 ���� �߸��� �κ��� ��ģ ��, �Ʒ��� ��ģ �κ��� �ۼ��ϼ���.
        // 1) Ŭ���� �ڵ忡�� public -> class �ٲٱ�
    	// 2) �Ʒ��� ���� �ڵ忡�� ������ �Ű����� �ֱ�
        Samp2 a = new Samp2(10);  //�⺻ ������
        int n4 = a.getX(); //a��ü���� getX()ȣ��
       
        // 5. �ڹ��� Ŭ������ ��ü�� ���� ���� �� Ʋ�� ����?
        // 1) Ŭ���� �ٱ��� ���� ������ ������ �� ����.
        // 2) Ŭ������ ��ü�� �����ϱ� ���� Ʋ�̴�.
        // 3) Ŭ������ ��� ������ �ʵ�� �θ���, Ŭ������ �ʵ�� �޼ҵ�� �̷������.
        // 4) �ʵ�� Ŭ���� ������ private���� public���� �����ϴ� ���� �ٶ����ϴ�.
          // 4�� ĸ��ȭ, ���������� -> ��ȣ�� �켱�̶� Ʋ��
        // 6. �����ڿ� ���� ���� �� Ʋ�� ����?
        // 1) �����ڰ� �ۼ��Ǿ� ���� ������ �����Ϸ��� �ڵ����� �⺻ �����ڸ� �߰��Ѵ�.
        // 2) �������� �̸����� Ŭ������ �̸��� �ݵ�� ���ƾ� �Ѵ�.
        // 3) this()�� ������ ������ �ٸ� �����ڸ� ȣ���ϴ� �ڵ��̴�.
        // 4) �����ڿ����� �ƹ� ���� �������� �ʱ� ������ return �� �� �� ����.
          // �� ���� �ִ�. public void Samp() ������ �ᵵ �ȵǰ� return �ڿ� ���� ������ �� ��
        // 7. �Ʒ� �ڵ带 ���� ������ �� "Samsung���� ���� 2023��� 72��ġ TV" �� ��������
        // Ŭ������ �ۼ����ּ���.
        TV myTV = new TV("Samsung", 2023, 72);
        myTV.explain();
       
        // 8. �Ʒ� �ڵ带 ��������� �� "����� 91" �� �������� Ŭ������ �ۼ����ּ���.
        Grade myGrade = new Grade(90, 88, 96);
        myGrade.getAverage();
    }
}
