import java.util.Scanner;
class Rect { //�ٷ�� ���� Ŭ������ ���� ����, ����Ʈ
	int width;
	int height;
	
	public int getArea() {
		return width * height; // return�� ���� �θ��� ������ ��
	}
}

public class RectApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect rect = new Rect();  //rect ��� ��ü
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		int area = rect.getArea();
		System.out.println("���̴� " + area);
		
	}

}
