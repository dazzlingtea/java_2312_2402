
public class ArrayExample {

	public static void main(String[] args) {
		//선언 생성 따로
		int a[]; 
		a = new int[5]; //생성
		//선언 생성 동시
		int b[] = new int[5];
		int []c = new int[5];
		int[]d = new int[5];
		
		//배열 초기화
		int e[] = {1, 2, 3, 4}; //배열의 각 요소 element
		
		int f[] =new int[5];
		f[3] = 2;
		for(int i=0 ; i<=4; i++) {
			System.out.println(i+" "+f[i]); //대괄호는 f배열에서 i번째 값을 가져와라
			
		}
		//System.out.println(f[-1]); java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(f[5]);
		
		int g[];
		//g[0] = 8;  에러 뜸 생성을 안하면 값을 넣을 수 없음 
		
	}

}
