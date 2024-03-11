import java.util.Scanner;

class MyRectangle2D {
	private double x, y, w, h;
	
	double getX() { return this.x; }
	double getY() { return this.y; }
	void setX(double x) { this.x = x; }
	void setY(double y) { this.y = y; }
	
	double getWidth() {	return this.w;	}
	double getHeight() { return this.h; }
	void setWidth(double w) { this.w = this.x + w;	}
	void setHeight(double h) { this.h = this.y + h; }
	
	MyRectangle2D() { this(0, 0, 1, 1); }
	MyRectangle2D(double x, double y, double w, double h) {
		this.x = x; this.y = y; this.w = w; this.h = h;
	}
	double getArea() { return this.w * this.h;	}
	double getPerimeter() { return 2 * (this.w + this.h); }
	
	boolean contains(double x, double y) {
		if(this.x<=x && x<this.x+this.w && this.y<=y && y<this.y+this.h) 
			 return true;
		else return false;
	}
	boolean contains(MyRectangle2D r) {
		if(this.x<=r.x && r.x+r.w<=this.x+this.w 
				&& this.y<=r.y && r.y+r.h<=this.y+this.h) 
			return true;
		else return false;
	}
	boolean overlaps(MyRectangle2D r) {
		if(this.x<=r.x && r.x<=this.x+this.w 
				&& this.y<=r.y && r.y<=this.y+this.h) return true;
		else if(this.x<=r.x && r.x<=this.x+this.w 
				&& this.y<=r.y+this.h && r.y+this.h<=this.y+this.h) return true;
		else if(this.x<=r.x+this.w && r.x+this.w<=this.x+this.w 
				&& this.y<=r.y && r.y<=this.y+this.h) return true;
		else if(this.x<=r.x+this.w && r.x+this.w<=this.x+this.w 
				&& this.y<=r.y+this.h && r.y+this.h<=this.y+this.h) return true;
		else return false;
	}
}


public class MyRectangle2DApp {
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

            MyRectangle2D r1 = new MyRectangle2D(x1, y1, x2, y2);
            MyRectangle2D r2 = new MyRectangle2D(x3, y3, x4, y4);

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
