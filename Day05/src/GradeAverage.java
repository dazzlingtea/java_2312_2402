
public class GradeAverage {

	public static void main(String[] args) {
		double score[][] = {{3.8, 3.9},
							{4.2, 4.5},
							{3.1, 2.6},
							{4.3, 4.4},
		};		
		//2�� for���� length �ʵ带 �̿�
		// �� 8�� �б��� ������ ���
		//�ٱ� �� ���� ��
		double sum = 0;
		for(int i=0 ; i<score.length ; i++) {
			for(int j=0 ; j<score[0].length ; j++) {
				sum += score[i][j];
			}
		}
		System.out.println("��ü ����� " + (sum/(score.length * score[0].length)));
	}

}
