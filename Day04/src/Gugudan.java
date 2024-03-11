
public class Gugudan {

	public static void main(String[] args) {
		for(int i=2 ; i<=9 ; i++) {//바깥은 n단
			for(int j=1 ; j<=9 ; j++) {//안은 n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //단마다 엔터 한 번
		}
		
		//9단->2단
		for(int i=9 ; i>=2 ; i--) {//바깥은 n단
			for(int j=1 ; j<=9 ; j++) {//안은 n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //단마다 엔터 한 번
		}
		
		for(int i=1 ; i<=9 ; i++) {//바깥은 n단
			for(int j=2 ; j<=9 ; j++) {//안은 n*j
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println(); //단마다 엔터 한 번
		}
		
		for(int i=2 ; i<=9 ; i++) {//바깥은 n단
			for(int j=1 ; j<=9 ; j++) {//안은 n*j
				System.out.println(j+"*"+i+"="+(j*i));
			}
			System.out.println(); //단마다 엔터 한 번
		}
		
		for(int i=1 ; i<=9 ; i++) {//바깥은 n단
			for(int j=2 ; j<=9 ; j++) {//안은 n*j
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println(); //단마다 엔터 한 번
		}


	}

}
