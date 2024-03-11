
public class GradeAverage {

	public static void main(String[] args) {
		double score[][] = {{3.8, 3.9},
							{4.2, 4.5},
							{3.1, 2.6},
							{4.3, 4.4},
		};		
		//2중 for문과 length 필드를 이용
		// 총 8개 학기의 학점의 평균
		//바깥 행 안쪽 열
		double sum = 0;
		for(int i=0 ; i<score.length ; i++) {
			for(int j=0 ; j<score[0].length ; j++) {
				sum += score[i][j];
			}
		}
		System.out.println("전체 평균은 " + (sum/(score.length * score[0].length)));
	}

}
