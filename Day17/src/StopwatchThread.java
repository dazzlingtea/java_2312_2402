import java.util.*;

class Stopwatch extends Thread implements Runnable {
	private int time = 0;
	private boolean flag = false;
	
	public void finish() {
		flag = true;
	}
	public void run() {
		while(true) {
			System.out.println(time / 10.0);
			time++;
			try {
				sleep(100);
				if(flag) return;
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class StopwatchThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stopwatch th = new Stopwatch();
		th.start();
		sc.nextLine();
		th.finish();
		
		

	}

}
