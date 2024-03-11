import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Á¤¼ö¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä > ");
		int num = sc.nextInt();
		String result = "È¦¼ö";
		
		if(num % 2 == 0) {
			result = "Â¦¼ö";
		}
		System.out.println(result);
		
		String result2 = num % 2 == 0? "Â¦¼ö":"È¦¼ö";
		System.out.println(result2);
	}

}
