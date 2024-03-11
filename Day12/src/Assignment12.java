import java.util.*;

public class Assignment12 {
    public static void main(String[] args) {
        // 1. Scanner�� ����ϱ� ���� 2���� ������ ��ġ�� �°� �Է����ּ���.
    	Scanner sc = new Scanner(System.in);
    	
        // 2. Calendar Ŭ������ �̿��� ���� �ð��� ���� ������ ����ϰ� ���ּ���.
        // ���� �ð��� 3:00 ~ 11:59�� Good Morning, 12:00 ~ 16:59�� Good Afternoon
        // 17:00~22:59 �̸� Good Evening, 23:00~2:59�� Good Night�� ����մϴ�.
    	
    	Calendar c = Calendar.getInstance();
    	int hour = c.get(Calendar.HOUR_OF_DAY);
    	
    	if(hour >= 3 && hour <= 11) System.out.println("Good Morning");
    	else if(hour <= 16) System.out.println("Good Afternoon");
    	else if(hour <= 22) System.out.println("Good Evening");
    	else System.out.println("Good Night");
       
        // 3. ���� ����� �̿��Ͽ� ���� ����(0.0, 0.5, 1.0, 1.5, ... 4.5) �� ��µǴ� �ڵ带 �ۼ����ּ���.
    	 System.out.println((double)((int)(Math.random() * 9)*0.5));
       
        // 4. ���� �ð��� 2024�� 1�� 1�� 0�� 0�� 0�� (�ѱ��ð� ����) �� �� �� ���̰� ������ ����ϴ� �ڵ带 �ۼ����ּ���.
    	 Calendar time = Calendar.getInstance();
    	 Calendar time2 = Calendar.getInstance();
    	 time2.set(2024, 0, 1, 0, 0, 0);
    	 
    	 long diff = time.getTimeInMillis() - time2.getTimeInMillis();
    	 System.out.println("4�� ����: "+ diff / 1000 +"��");
    	 
        // 5. �Ʒ� ���ڿ����� �ܾ� ���̿� �ִ� ������ ���� ���ϴ� �ڵ带 �ۼ����ּ���.
        String s51 = "hello123java45is91fun14"; // ���� 273
        String s52 = "100hidden30number10finding20is40so60hard20"; // ���� 280
        String s53 = "a1b2c3d4e5f6g7"; // ���� 28
        
        String regex = "[a-z]";
        StringTokenizer st = new StringTokenizer(s51, regex);
        int tokens = st.countTokens();
        int sum = 0;
		 System.out.println(tokens);
		 for(int i=0; i<tokens; i++) {
			 String cur = st.nextToken(); //�ϳ��� ������
			 sum += Integer.parseInt(cur);
		 }
		 System.out.println(sum);
        
	    System.out.println("���� "+calcSum(s51));
	    System.out.println("���� "+calcSum(s52));
	    System.out.println("���� "+calcSum(s53));
	    
    }
    public static int calcSum(String s) {
        int sum = 0;
        String[] sArr = s.split("[a-zA-Z]");
        
        for(String str :sArr) {
        	if(!str.isEmpty()) 
        	sum += Integer.parseInt(str);
        }
        return sum;
    }
}