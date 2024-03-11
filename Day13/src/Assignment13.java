import java.util.*;

public class Assignment13
{
    public static void main(String[] args) {
        // 1. ���� �ڵ忡 ���� �������� Ʋ�� ���� ���ÿ�. �� 2��
        //Vector<Integer> v = new Vector<Integer>(30);
        // 1) Integer Ÿ�� ��ü�� ������ �� �ִ� ���͸� �����ϴ� �ڵ��.
        // 2) ���� v �� ���Ҹ� 30���� ������ �� �ִ�.
        // 3) v.add(10)�� ���� 10�� ���Ϳ� �����Ѵ�.
        // 4) ���� v���� �Ǽ��� ���� �� ����.
       
        // 2. ���� �䱸������ �����ϴ� �÷��� �ڵ带 �ۼ��ϼ���.
        // 2-1. ���ڿ��� �����ϴ� ���� v21
    	Vector<String> v21 = new Vector<String>();
        // 2-2. Ű�� ���ڿ��̰� ���� �Ǽ��� �ؽø� h22
    	HashMap<String, Double> h22 = new HashMap<String, Double>();
        // 2-3. ���� �̸��� �α��� �����ϴ� �ؽø� h23
    	HashMap<String, Integer> h23 = new HashMap<String, Integer>();
       
        // 3. �Ʒ� �ڵ带 Iterator�� �̿��� ���� ����� �������� �����ϼ���.
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0 ; i<10 ; i++) v.add(i);
        
        Iterator<Integer> it3 = v.iterator();
        while(it3.hasNext()) {
        	int n3 = it3.next();
        	System.out.print(n3 + " ");
        }
        System.out.println();
       
        // 4. while ���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹޾�
        // ���Ϳ� �����ϰ�, �� �� ���� ū ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
       Vector<Integer> v4 = new Vector<Integer>();
       Scanner sc = new Scanner(System.in);
       
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
       HashMap<String,Double> gradeMap = new HashMap<String, Double>();
       
       gradeMap.put("A", 4.0);
       gradeMap.put("B", 3.0);
       gradeMap.put("C", 2.0);
       gradeMap.put("D", 1.0);
       gradeMap.put("F", 0.0);
       
       double totalGrade = 0;
       int totalSubjects = 6;
       for(int i=0; i<totalSubjects; i++) {
    	   String input = sc.next();
    	   if(gradeMap.containsKey(input))
    		   totalGrade += gradeMap.get(input);
       }
       System.out.printf("%.6f",totalGrade / totalSubjects);
    }
}
