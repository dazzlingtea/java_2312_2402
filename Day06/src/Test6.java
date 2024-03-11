class Grade3 {
	int g;
	int sum, count;
	public Grade3(int... g) {
		this.sum = 0;
		this.count = 0;
		for(int i: g) {
			this.sum += i;
			this.count ++;
		}
	}
	public void getAverage() {
		System.out.println("Grade2 ∆Ú±’¿∫ " + this.sum/this.count); 
	}
}

public class Test6 {
	public static void main(String[] args) {
		
        Grade3 myGrade = new Grade3(90, 88, 96);
        myGrade.getAverage();
	}

}
