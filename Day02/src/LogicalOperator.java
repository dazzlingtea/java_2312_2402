
public class LogicalOperator {
	public static void main(String[] args) {
		//AND\
		System.out.println(true && false);
		System.out.println((5!=6) && (7>3));
		
		// OR
		System.out.println(false || false);
		System.out.println((7==7) || (5==6));
		
		//NOT
		System.out.println(!true);
		System.out.println(!(6!=6));
		System.out.println(!((5==6) || (4>3)));
		
		//XOR 다르면 true 같으면 false
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((5>3) ^ (4<=7));

		
	}
}
