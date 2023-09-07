package xxx;

public class Calculator {
//	  在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果
		int x;
		int y;
		Calculator(){
			
		}
		
		Calculator(int x , int y){
			this.x = x ;
			this.y = y ;
		}
		
		public double powerXY(int x, int y) throws CalException {
			if (x == 0 && y == 0) {
				throw new CalException("0的0次方沒有意義");
			}else if (y < 0) {
				throw new CalException("次方為負值，結果回傳不為整數");
			}else {
				double power = Math.pow(x , y) ;
				return power ;
			}
		}
}
