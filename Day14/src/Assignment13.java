import java.util.*;

public class Assignment13 {
    public static void main(String[] args) {
        // 1. 다음 코드에 대한 설명으로 틀린 것을 고르시오.
        Vector<Integer> v = new Vector<Integer>(30); // capacity 초기 설정
        // 1) Integer 타입 객체만 저장할 수 있는 벡터를 생성하는 코드다.
        // 2) 벡터 v 는 원소를 30개만 저장할 수 있다.
        // 3) v.add(10)은 정수 10을 벡터에 삽입한다.
        // 4) 벡터 v에는 실수를 넣을 수 없다.
       
        // 2. 다음 요구사항을 만족하는 컬렉션 코드를 작성하세요.
        // 2-1. 문자열을 저장하는 벡터 v21
        // 2-2. 키가 문자열이고 값이 실수인 해시맵 h22
        // 2-3. 나라 이름과 인구를 저장하는 해시맵 h23   Long 쓰심
       
        // 3. 아래 코드를 Iterator를 이용해 같은 결과가 나오도록 수정하세요.
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
       
        // 4. while 문을 이용하여 -1이 입력될 때까지 정수를 입력받아
        // 벡터에 저장하고, 그 중 가장 큰 수를 출력하는 코드를 작성하세요.
       Scanner sc = new Scanner(System.in);
       Vector<Integer> v4 = new Vector<Integer>();
       
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

