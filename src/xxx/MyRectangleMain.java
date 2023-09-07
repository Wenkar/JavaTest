package xxx;

public class MyRectangleMain {
	public static void main(String[] args) {
//		(1) 使用public MyRectangle()建構子建立物件，
//		    設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle m = new MyRectangle();
		m.setWidth(10);
		m.setDepth(20);
		System.out.println(m.getArea());
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件，
//		    設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle w = new MyRectangle(10 , 20);
		System.out.println(w.getArea());
	}
}
