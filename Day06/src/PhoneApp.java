class Phone {
	String company;
	int size;
	
	public Phone(int size) {
		this("삼성", size); 
    }
	
	public Phone(String company, int size) {
		this.company = company;
		this.size = size; //size 라는 인트형 필드 생성
    }
	
	public String getInfo() {
		return "제조사 = "+ this.company +" 크기 = "+ this.size +"인치";
	}
	
}
public class PhoneApp {

	public static void main(String[] args) {
		Phone p[];//Phone형 배열을 만든다
		p = new Phone[10]; // 배열 생성   ->이제 객체도 생성해야 함
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Phone(i+1); //클래스라서 [] 말고 (), i+1은 기본생성자가 없으니까
		}//p[0] = Phone(1)->5줄 삼성,1 ->9줄 this.company="삼성"...
		//아래 a.getInfo로 가져오면 제조사 = 삼성 크기 = 1인치
		
		for(Phone a: p) { //a는 Phone
			
			System.out.println(a.getInfo());
		}
	}

}
