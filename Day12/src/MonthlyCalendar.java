import java.util.*;
public class MonthlyCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		System.out.println(year+"년 "+month+"월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int startDay = c.get(Calendar.DAY_OF_WEEK);
		String firstWeek = "";
		
		for(int i=1; i<startDay; i++) {
			firstWeek += "\t";
		}
		
		int dayCount = 1;
		for(int i=startDay ; i<=7; i++) {
			firstWeek += dayCount + "\t";
			dayCount++;
		}
		System.out.println(firstWeek);
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
		int maxDay = c.getActualMaximum(Calendar.DATE);
		
		// 주 별로 출력
		
		while(true) {
			String curWeek = "";
			for(int i=0; i<7; i++) {
				curWeek += dayCount + "\t";
				if(dayCount == maxDay) break;
				dayCount++; 
			}
			System.out.println(curWeek);
			if(dayCount == maxDay) break;
		}
		
		// 일자별로 요일을 판단해서 출력
		dayCount = 7;
		for(int i = dayCount ; i<= maxDay ; i++) {
			if(i % 7 == 0) {
				System.out.println();}
			System.out.print(i+"\t");
		}
		
	}

}
