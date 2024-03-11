
interface PhoneInterface {
	int SIZE = 20; // 상수 지정 -> 자동으로 public static final
	void sendCall(); // 추상 메소드 -> 자동으로 public abstract
	private void wifiConnect() {
		System.out.println("와이파이 연결");
	} //private은 상속받을 수가 없어서 추상 될 수 없음
	default void dataConnect() { // 상속가능 default 메소드 -> 자동으로 public
		System.out.println("데이터 연결");
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


class ApplePhone implements PhoneInterface { //인터도 추상메서드 구현해야함
	public void sendCall() {
		System.out.println("전화 송신");
	}
	public void applePay() {
		System.out.println("애플페이 결제");
	}
}

class AIPhone implements AIInterface, MusicPhoneInterface {
	public void recognizeSpeech () {System.out.println("음성 인식");}
	public void chatGPT() {System.out.println("챗GPT");}
	public void albumView() {System.out.println("앨범보기");}
	public void musicPlay() {System.out.println("음악 재생");}
	public void musicStop() {System.out.println("음악 중지");}
	public void sendSMS() {System.out.println("문자 송신");}
	public void receiveSMS() {System.out.println("문자 수신");}
	public void sendCall() {System.out.println("전화 송신");}
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
	public void sendSMS() {System.out.println("문자 송신");} // MobilePhoneInterface
	public void receiveSMS() {System.out.println("문자 수신");}
	public void musicPlay() {System.out.println("음악 재생");} // MP3Interface
	public void musicStop() {System.out.println("음악 중지");}
	public void sendCall() {System.out.println("전화 송신");} // PhoneInterface 추상메서드 sendCall
}




	

public class PhoneApp {
	public static void main(String[] args) {
		PhoneInterface iphone;
		//iphone = new PhoneInterface();
		
		ApplePhone iPhone = new ApplePhone();
		iPhone.sendCall();
//		iPhone.wifiConnect(); private이라서 에러
		iPhone.dataConnect(); // 데이터 연결, 와이파이 연결
		iPhone.applePay();
		
		SmartPhone galaxy = new SmartPhone();
		galaxy.setMemo("갤럭시 노트 20");
		System.out.println(galaxy.getMemo());
		galaxy.dataConnect();
		System.out.println(SmartPhone.SIZE); //static-way
		// public static final int SIZE = 20;
	}

}
