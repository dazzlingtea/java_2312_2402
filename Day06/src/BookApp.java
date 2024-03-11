import java.util.Scanner;
class Book {
	String title, author;
	public Book() {
		this("제목없음");
	}
	public Book(String title) { //String 하나짜리 2개 만들 수 없음
		this(title, "저자미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getInfo() {
		return this.title + "(" + this.author + ")";
	}
	
}
public class BookApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); //북 배열의 크기가 결정됨
		sc.nextLine(); //콘솔에 정수 입력 후 엔터를 무시하라고
		
		Book b[] = new Book[count];
		for(int i=0; i<count; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			
			if(title.length() == 0 && author.length() == 0) {
				b[i] = new Book(); //배열 요소에 객체 대입
			} else if(author.length() == 0) {
				b[i] =new Book(title);
			} else {
				b[i] = new Book(title, author);
			}
		}
		for(Book c : b) {//레퍼런스 변수 배열 b,에 대한 각각의 변수는 Book 타입 
			System.out.println(c.getInfo()); //c에 있는 겟인포를 가져와야
			//c.title c.author를 가져옴
		}
	}

}
