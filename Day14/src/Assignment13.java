import java.util.*;

public class Assignment13 {
    public static void main(String[] args) {
        // 1. ���� �ڵ忡 ���� �������� Ʋ�� ���� ���ÿ�.
        Vector<Integer> v = new Vector<Integer>(30); // capacity �ʱ� ����
        // 1) Integer Ÿ�� ��ü�� ������ �� �ִ� ���͸� �����ϴ� �ڵ��.
        // 2) ���� v �� ���Ҹ� 30���� ������ �� �ִ�.
        // 3) v.add(10)�� ���� 10�� ���Ϳ� �����Ѵ�.
        // 4) ���� v���� �Ǽ��� ���� �� ����.
       
        // 2. ���� �䱸������ �����ϴ� �÷��� �ڵ带 �ۼ��ϼ���.
        // 2-1. ���ڿ��� �����ϴ� ���� v21
        // 2-2. Ű�� ���ڿ��̰� ���� �Ǽ��� �ؽø� h22
        // 2-3. ���� �̸��� �α��� �����ϴ� �ؽø� h23   Long ����
       
        // 3. �Ʒ� �ڵ带 Iterator�� �̿��� ���� ����� �������� �����ϼ���.
        Vector<Integer> v3 = new Vector<Integer>();
        for(int i=0 ; i<10 ; i++) v3.add(i);
        for(int i=0 ; i<v3.size() ; i++)
            System.out.print(v3.get(i) + " ");
        
        Iterator<Integer> it = v3.iterator();
        while(it.hasNext()) {
        	int n3 = it.next();
        	System.out.print(n3+" ");
        }	
        System.out.println();
       
        // 4. while ���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹޾�
        // ���Ϳ� �����ϰ�, �� �� ���� ū ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
       Scanner sc = new Scanner(System.in);
       Vector<Integer> v4 = new Vector<Integer>();
       
       while(true) {
    	   int n4 = sc.nextInt();
    	   if(n4 == -1) break;
    	   v4.add(n4);
       }
       System.out.println(Collections.max(v4));
       
        // 5. 5�� �� �������� ��ȯ�ϴ� �ؽø��� �ۼ��ϰ�,
        // (A -> 4.0, B -> 3.0, C -> 2.0, D -> 1.0, F -> 0.0)
        // 6���� �� �Է¹޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
        // ����) A A B B C D -> 2.833333
       HashMap<String,Double> hm = new HashMap<String, Double>();
       hm.put("A", 4.0);
       hm.put("B", 3.0);
       hm.put("C", 2.0);
       hm.put("D", 1.0);
       hm.put("F", 0.0);
       
       double sum = 0.0;
       for(int i=0; i<6; i++) {
    	   String score = sc.next();
    	   if(hm.containsKey(score))
    		   sum += hm.get(score);
       }
       System.out.println(sum / 6);
    }
}

