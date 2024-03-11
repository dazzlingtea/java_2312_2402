
interface PhoneInterface {
	int SIZE = 20; // ��� ���� -> �ڵ����� public static final
	void sendCall(); // �߻� �޼ҵ� -> �ڵ����� public abstract
	private void wifiConnect() {
		System.out.println("�������� ����");
	} //private�� ��ӹ��� ���� ��� �߻� �� �� ����
	default void dataConnect() { // ��Ӱ��� default �޼ҵ� -> �ڵ����� public
		System.out.println("������ ����");
		wifiConnect();
	}
}

interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	void musicPlay();
	void musicStop();
}

interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
	void albumView();
}

interface AIInterface {
	void recognizeSpeech();
	void chatGPT();
}


class ApplePhone implements PhoneInterface { //���͵� �߻�޼��� �����ؾ���
	public void sendCall() {
		System.out.println("��ȭ �۽�");
	}
	public void applePay() {
		System.out.println("�������� ����");
	}
}

class AIPhone implements AIInterface, MusicPhoneInterface {
	public void recognizeSpeech () {System.out.println("���� �ν�");}
	public void chatGPT() {System.out.println("êGPT");}
	public void albumView() {System.out.println("�ٹ�����");}
	public void musicPlay() {System.out.println("���� ���");}
	public void musicStop() {System.out.println("���� ����");}
	public void sendSMS() {System.out.println("���� �۽�");}
	public void receiveSMS() {System.out.println("���� ����");}
	public void sendCall() {System.out.println("��ȭ �۽�");}
}

class Memo {
	private String memo = "";
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}
}

class SmartPhone extends Memo implements MobilePhoneInterface, MP3Interface{
	public void sendSMS() {System.out.println("���� �۽�");} // MobilePhoneInterface
	public void receiveSMS() {System.out.println("���� ����");}
	public void musicPlay() {System.out.println("���� ���");} // MP3Interface
	public void musicStop() {System.out.println("���� ����");}
	public void sendCall() {System.out.println("��ȭ �۽�");} // PhoneInterface �߻�޼��� sendCall
}




	

public class PhoneApp {
	public static void main(String[] args) {
		PhoneInterface iphone;
		//iphone = new PhoneInterface();
		
		ApplePhone iPhone = new ApplePhone();
		iPhone.sendCall();
//		iPhone.wifiConnect(); private�̶� ����
		iPhone.dataConnect(); // ������ ����, �������� ����
		iPhone.applePay();
		
		SmartPhone galaxy = new SmartPhone();
		galaxy.setMemo("������ ��Ʈ 20");
		System.out.println(galaxy.getMemo());
		galaxy.dataConnect();
		System.out.println(SmartPhone.SIZE); //static-way
		// public static final int SIZE = 20;
	}

}
