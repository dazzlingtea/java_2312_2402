import java.util.*;

public class TimeMeasure {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		long sum = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter�� ���� ���� (" + i+"ȸ��)");
			sc.nextLine();
			Calendar c = Calendar.getInstance();
			long time = c.getTimeInMillis();
			
			System.out.println("Enter�� ���� ����");
			sc.nextLine();
			Calendar c2 = Calendar.getInstance();
			long time2 = c2.getTimeInMillis();
			
			System.out.println(i+"ȸ�� ���: "+(time2-time)+"ms");
			
			sum += (time2 - time);
		}
		
		long error = Math.round(sum / 5) - 5000;
		if(error < 0)
			System.out.println("FAST "+ Math.abs(error)+"ms");
		else if(error > 0)
			System.out.println("SLOW "+ error+"ms");
		else
			System.out.println("EXACT");
	}

}
