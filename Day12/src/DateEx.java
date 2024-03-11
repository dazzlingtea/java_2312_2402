import java.util.*;
public class DateEx {

	public static void main(String[] args) {
		Date d= new Date(); // 매개변수 안 들어가면 현재 시간
		System.out.println(d);
		System.out.println(d.getTime());//1705058424242 epoch converter

		Date d2= new Date(0); // 
		System.out.println(d2); //한국은 그리니치+9시간이라 9 출력
		
		if(d.after(d2)) //d가 d2보다
			System.out.println("after");
		if(d.before(d2))
			System.out.println("before");
		
		d2.setTime(1705058444L); //setTime으로 시간 바꾸기
		System.out.println(d2);
		
		//비권장 calendar 쓴다
		System.out.println(d.getYear()); //1900년 부터 몇 년? 
		System.out.println(d.getMonth()); //0부터 몇 월? 1월
		System.out.println(d.getDate()); 
	}

}
