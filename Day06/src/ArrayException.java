
public class ArrayException {

	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			for(int i=0; i<5; i++) {
				a[i] = i;
				System.out.println(i);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다!");
		}
		finally { 
			System.out.println("끝!");
		}
	}

}
