import java.util.*;

public class Assignment13
{
    public static void main(String[] args) {
        // 1. 다음 코드에 대한 설명으로 틀린 것을 고르시오. 답 2번
        //Vector<Integer> v = new Vector<Integer>(30);
        // 1) Integer 타입 객체만 저장할 수 있는 벡터를 생성하는 코드다.
        // 2) 벡터 v 는 원소를 30개만 저장할 수 있다.
        // 3) v.add(10)은 정수 10을 벡터에 삽입한다.
        // 4) 벡터 v에는 실수를 넣을 수 없다.
       
        // 2. 다음 요구사항을 만족하는 컬렉션 코드를 작성하세요.
        // 2-1. 문자열을 저장하는 벡터 v21
    	Vector<String> v21 = new Vector<String>();
        // 2-2. 키가 문자열이고 값이 실수인 해시맵 h22
    	HashMap<String, Double> h22 = new HashMap<String, Double>();
        // 2-3. 나라 이름과 인구를 저장하는 해시맵 h23
    	HashMap<String, Integer> h23 = new HashMap<String, Integer>();
       
        // 3. 아래 코드를 Iterator를 이용해 같은 결과가 나오도록 수정하세요.
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0 ; i<10 ; i++) v.add(i);
        
        Iterator<Integer> it3 = v.iterator();
        while(it3.hasNext()) {
        	int n3 = it3.next();
        	System.out.print(n3 + " ");
        }
        System.out.println();
       
        // 4. while 문을 이용하여 -1이 입력될 때까지 정수를 입력받아
        // 벡터에 저장하고, 그 중 가장 큰 수를 출력하는 코드를 작성하세요.
       Vector<Integer> v4 = new Vector<Integer>();
       Scanner sc = new Scanner(System.in);
       
       while(true) {
    	   int n4 = sc.nextInt();
    	   if(n4 == -1) break;
    	   v4.add(n4);
       }
       System.out.println(Collections.max(v4));
       
        // 5. 5개 평어를 학점으로 변환하는 해시맵을 작성하고,
        // (A -> 4.0, B -> 3.0, C -> 2.0, D -> 1.0, F -> 0.0)
        // 6개의 평어를 입력받아 학점의 평균을 출력하는 코드를 작성하세요.
        // 예시) A A B B C D -> 2.833333
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
