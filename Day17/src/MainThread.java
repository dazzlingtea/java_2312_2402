
public class MainThread {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getState());// ����ǰ� �־ RUNNABLE

	}

}
