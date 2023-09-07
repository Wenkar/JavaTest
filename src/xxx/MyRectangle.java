package xxx;

public class MyRectangle {
	double width;
	double depth;
	
	// void setWidth(double width): 將收到的引數指定給width屬性
	void setWidth(double width) {
		this.width = width ;
	}
	
	//void setDepth(double depth): 將收到的引數指定給depth屬性
	void setDepth(double depth) {
		this.depth = depth ;
	}
	
	//double getArea(): 能計算該長方形的面積
	double getArea() {
		double area = width * depth ;
		return area ;
	}
	
//	public MyRectangle(): 不帶參數也無內容的建構子
	public MyRectangle() {
		
	}
	
//	public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width ;
		this.depth = depth ;
	}
	
	
}
