
public class Gugudan {

	public static void main(String[] args) {
		for(int i=2 ; i<=9 ; i++) {//�ٱ��� n��
			for(int j=1 ; j<=9 ; j++) {//���� n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //�ܸ��� ���� �� ��
		}
		
		//9��->2��
		for(int i=9 ; i>=2 ; i--) {//�ٱ��� n��
			for(int j=1 ; j<=9 ; j++) {//���� n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //�ܸ��� ���� �� ��
		}
		
		for(int i=1 ; i<=9 ; i++) {//�ٱ��� n��
			for(int j=2 ; j<=9 ; j++) {//���� n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //�ܸ��� ���� �� ��
		}
		
		for(int i=2 ; i<=9 ; i++) {//�ٱ��� n��
			for(int j=1 ; j<=9 ; j++) {//���� n*j
				System.out.println(j+"*"+i+"="+(j*i));
			}
			System.out.println(); //�ܸ��� ���� �� ��
		}
		
		for(int i=1 ; i<=9 ; i++) {//�ٱ��� n��
			for(int j=2 ; j<=9 ; j++) {//���� n*j
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println(); //�ܸ��� ���� �� ��
		}


	}

}
