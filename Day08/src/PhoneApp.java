class Phone {
	private int size;
	private String brand;
	public Phone( ) {
		this(0, "�Ｚ");
	}
	public Phone(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
	public void showPhone( ) {
		System.out.println(this.brand + "�� " + this.size + "��ġ ��" );
		
	}
	
}
class SmartPhone extends Phone {
	private int pixel;
	public SmartPhone(int size, String brand, int pixel) {
		super(size, brand);
		this.pixel = pixel;
	}
	public SmartPhone(int pixel) {
		super();
		this.pixel = pixel;
	}
	public void showSmartPhone() {
		System.out.print(pixel + "ȭ�� ");
		showPhone();
	}
}

public class PhoneApp {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(10);
		sp.showPhone();
		sp.showSmartPhone();
		SmartPhone sp2 = new SmartPhone(100, "����", 200);
		sp2.showPhone();
		sp2.showSmartPhone();

	}

}
