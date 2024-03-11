import java.awt.*; // GUI
import java.awt.event.*;
import javax.swing.*; // GUI

class ProgressLabel extends JLabel {
	private int barSize = 0;
	private int maxBarSize;
	
	public ProgressLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	//paint
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		
		int width = (int)((double)(this.getWidth())/maxBarSize*barSize);
		if(width == 0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	//키를 누르면 차고 아니면 안 차고
	synchronized public void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			} catch(InterruptedException e) {return;}
		}
		barSize++;
		repaint();
		notify();
	}
	synchronized public void consume() {
		if(barSize == 0) {
			try {
				wait();
			} catch(InterruptedException e) {return;}
		}
		barSize--;
		repaint();
		notify();
	}
	
}
class ConsumeThread extends Thread {
	private ProgressLabel bar;
	public ConsumeThread(ProgressLabel bar) {
		this.bar = bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			} catch(InterruptedException e) { return; }
		}
	}
}
		
public class TabThread extends JFrame{
	private ProgressLabel bar = new ProgressLabel(100);
	
	public TabThread(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void kePressed(KeyEvent e) {
				bar.fill();
			}
		}); // 이거 대체 뭐임
		
		setSize(350, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		ConsumeThread th = new ConsumeThread(bar);
		th.start();
	}
	
	public static void main(String[] args) {
		new TabThread("Progress Bar"); // 이건 또 뭐임

	}

}
