package xxx;

import java.util.Scanner;


public class CalTest {
//	 CalTest.java執行後，使用者可
//	 以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//	 1. x與y同時為0，(產生自訂的CalException例外物件)
//	 2. y為負值，而導致x的y次方結果不為整數
//	 3. x與y皆正確情況下，會顯示運算後結果
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {    //設無窮迴圈
		try {
		System.out.print("請輸入要成為底數的數值x :");
		int x = sc.nextInt() ;
	
		System.out.print("請輸入要成為次方的數值y :");
		int y = sc.nextInt();
		Calculator xy = new Calculator(x , y);			
		System.out.print("x的y次方是 :"+ xy.powerXY(x, y));
		break;    //設break，讓程式執行完後跳出
		} catch (CalException e) {   //程式會先去抓有無例外，有的話直接從例外跳出
			System.out.println(e);   //沒有的話進行try裡的程式碼
		}

		}
	sc.close();	
	}
	
}
