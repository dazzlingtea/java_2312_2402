import java.util.*;
public class CalendarEx {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); //0부터 시작이라 1월
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 6은 금요일
		System.out.println(c.get(Calendar.HOUR)); //12시간  
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24시간  
		System.out.println(c.get(Calendar.AM_PM));  
		System.out.println(c.get(Calendar.MINUTE));   
		System.out.println(c.get(Calendar.SECOND)); 
		System.out.println(c.get(Calendar.MILLISECOND));
		
		c.set(2024, 0, 13, 12, 34, 56);
		System.out.println(c);

	}

}
