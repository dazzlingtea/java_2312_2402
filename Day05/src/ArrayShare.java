
public class ArrayShare {

	public static void main(String[] args) {
		int array1[] = new int[5];
		int array2[] = array1;
		//레퍼런스 치환 = 배열 공유
		
		array1[1] = 2;
		array2[1] = 3;
		
		// array1 : 0 2 0 0 0
		// array2 : 0 3 0 0 0
		System.out.println(array1[1]);
		
		int a1[] = new int[5];
		int a2[] = new int[5];
		
		a1[1] = 2;
		for(int i=0 ; i<= 4 ; i++) {
			a2[i] = a1[i];
		}
		
	}

}
