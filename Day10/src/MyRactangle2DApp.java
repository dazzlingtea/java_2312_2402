import java.util.Scanner;
// 아.. 생성자 잘못 만듬 기준점 x+너비 y+높이인데...
class MyRectanglePD {
	private double x1, y1, x2, y2, width, height;
	
	double getX1() { return this.x1; }
	double getY1() { return this.y1; }
	void setX1(double x) { this.x1 = x; }
	void setY1(double y) { this.y1 = y; }
	
	double getX2() { return this.x2; }
	double getY2() { return this.y2; }
	void setX2(double x) { this.x2 = x; }
	void setY2(double y) { this.y2 = y; }
	
	double getWidth() {	return this.width;	}
	double getHeight() { return this.height; }
	void setWidth() { this.width = Math.abs(this.x2 - this.x1);	}
	void setHeight() { this.height = Math.abs(this.y2 - this.y1); }
	
	MyRectanglePD() { this(0, 0, 1, 1); }
	MyRectanglePD(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.width = Math.abs(this.x1 - this.x2);
		this.height = Math.abs(this.y1 - this.y2);
	}
	
	double getArea() { return this.width * this.height;	}
	double getPerimeter() { return 2 * (this.width + this.height); }
	
	boolean contains(double x, double y) {
			if(this.x1<=x && x<=this.x2 && this.y1<=y && y<=this.y2) 
				 return true;
			else return false;
	}
	boolean contains(MyRectanglePD r) {
		if(this.x1<=r.x1 && r.x2<=this.x2 && this.y1<=r.y1 && r.y2<=this.y2) 
			return true;
		else return false;
	}
	boolean overlaps(MyRectanglePD r) {
		if(this.x1<=r.x1 && r.x1<=this.x2 && this.y1<=r.y1 && r.y1<=this.y2) return true;
		else if(this.x1<=r.x1 && r.x1<=this.x2 && this.y1<=r.y2 && r.y2<=this.y2) return true;
		else if(this.x1<=r.x2 && r.x2<=this.x2 && this.y1<=r.y1 && r.y1<=this.y2) return true;
		else if(this.x1<=r.x2 && r.x2<=this.x2 && this.y1<=r.y2 && r.y2<=this.y2) return true;
		else return false;
	}
}

public class MyRactangle2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();

            MyRectanglePD r1 = new MyRectanglePD(x1, y1, x2, y2);
            MyRectanglePD r2 = new MyRectanglePD(x3, y3, x4, y4);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x5, y5));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}

