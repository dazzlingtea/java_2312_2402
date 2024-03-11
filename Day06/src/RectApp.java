import java.util.Scanner;
class Rect { //다루기 위한 클래스를 따로 만듬, 디폴트
	int width;
	int height;
	
	public int getArea() {
		return width * height; // return은 나를 부르는 곳으로 감
	}
}

public class RectApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect rect = new Rect();  //rect 라는 객체
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		int area = rect.getArea();
		System.out.println("넓이는 " + area);
		
	}

}
