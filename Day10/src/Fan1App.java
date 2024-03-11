import java.util.*;

class Fan1 {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	int speed = SLOW;
	boolean on = false;
	double radius = 5;
	String color = "blue";
	
	int getSpeed() { return this.speed; }
	boolean getOn() { return this.on; }
	double getRadius() { return this.radius; }
	String getColor() { return this.color; }
	
	void setSpeed(int speed) {this.speed = speed;}
	void setOn(boolean on) {this.on = on;}
	void setRadius(double radius) {this.radius = radius;}
	void setColor(String color) {this.color = color;}
	
	Fan1() {
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
//Object Ŭ���� �� toString �޼ҵ带 �������̵�
	public String toString() {
		if(this.on) {//��ǳ�Ⱑ �����ִٸ� ��ǳ���� �ӵ�, ����, �������� �ϳ��� string���� ��ȯ
			return String.format("speed %d\ncolor %s\nradius %.2f", 
								this.speed, this.color, this.radius);
		}
		else {//��ǳ�Ⱑ �����ִٸ�, ��ǳ���� ����, ������, ��fan is off�� �ϳ��� string���� ��ȯ
			return String.format("color %s\nradius %.2f\nfan is off",
								this.color, this.radius);
		}
	}
}


public class Fan1App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // ���� �� �Է� ����

        Fan1 fan1 = new Fan1();
        for (int i = 0; i < n; i++) { //speed, radius, on �� �ɼ��� ���� �� n��ŭ �Է� ����
            String op = sc.next(); //speed �Է� ��
            String val = sc.next(); //FAST �Է� ��
            if (op.compareTo("speed") == 0) { //���� �ɼ� �� speed��?
                if (val.compareTo("SLOW") == 0) fan1.setSpeed(Fan1.SLOW);
                else if (val.compareTo("FAST") == 0) fan1.setSpeed(Fan1.FAST);
                else fan1.setSpeed(Fan1.MEDIUM);
            } else if (op.compareTo("radius") == 0) { //���� �ɼ� �� radius��?
                fan1.setRadius(Double.parseDouble(val));
            } else if (op.compareTo("color") == 0) {
                fan1.setColor(val);
            } else if (op.compareTo("on") == 0) {
                if (val.compareTo("true") == 0) fan1.setOn(true);
                else fan1.setOn(false);
            }
        }
        System.out.println(fan1.toString());
    }
}