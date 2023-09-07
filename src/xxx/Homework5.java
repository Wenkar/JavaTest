package xxx;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
	// 第1題的starSquare方法創建
	public static void starSquare(int width, int height) {

		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 第2題的randAvg()方法創建
	public static void randAvg() {
		int[] r = new int[10];

		System.out.print("本次亂數結果 :");
		for (int i = 0; i < r.length; i++) {
			Random ran = new Random();
			int k = ran.nextInt(100) + 1;
			r[i] = k;
			System.out.print(r[i] + " ");
		}
		System.out.println();
		System.out.print("平均值 :");
		int count = 0;
		for (int i = 0; i < r.length; i++) {
			count += r[i];
		}
		int avg = count / 10;
		System.out.println(avg);
	}
	
	//第3題的int maxElement(int x[][])與double maxElement(double x[][])方法創建
	public static int maxElement(int x[][]) {
		
		int max = 0 ;
		
		for(int i = 0 ; i < x.length ; i++) {
			for(int j = 0 ; j < x[i].length ; j++) {
			if(x[i][j] > max) {
				max = x[i][j] ;
			}	
			}
		}
		return max;
		
	}
	
	public static double maxElement(double x[][]) {
		
		double max = 0.0 ;
		
		for(int i = 0 ; i < x.length ; i++) {
			for(int j = 0 ; j < x[i].length ; j++) {
			if(x[i][j] > max) {
				max = x[i][j] ;
			}	
			}
		}
		return max ;
		
	}
	//創建第6題的genAuthCode方法
	public static void genAuthCode(){
		Random ath = new Random();
		String cha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for(int i = 0 ; i < 8 ; i++) {
			int k = ath.nextInt(cha.length()) ;
			System.out.print(cha.charAt(k));
		}
	}

//		1. 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//		圖：

	public static void main(String[] args) {
		System.out.println("1. 請輸入寬與高 :");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);

		sc.close();
		
//		2. 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
		System.out.println("2. ");
		randAvg();

//		3. 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		可以找出二維陣列的最大值並回傳，如圖：
		System.out.println("3.");
		int [][] intArray = {
				{1 , 6 , 3},
				{9 , 5 , 2}
		};
		double [][] doubleArray = {
				{1.2 , 3.5 , 2.2},
				{7.4 , 2.1 , 8.2}
		};
		Homework5 w = new Homework5();
		System.out.print("intArray陣列的最大值是 : ");
		System.out.println(w.maxElement(intArray));
		System.out.print("doubleArray陣列的最大值是 : ");
		System.out.println(w.maxElement(doubleArray));
		
		
//		4. 請設計一個類別MyRectangle：
//		(1) 有兩個double型態的屬性為width, depth
//		(2) 有三個方法：
//		void setWidth(double width): 將收到的引數指定給width屬性
//		void setDepth(double depth): 將收到的引數指定給depth屬性
//		double getArea(): 能計算該長方形的面積
//		(3) 有兩個建構子：
//		public MyRectangle(): 不帶參數也無內容的建構子
//		public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性

//		5. 請另外建立一個MyRectangleMain類別，此類別只有main方法
//		(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

//		6. 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖
		System.out.println("6. ");
		System.out.println("本次隨機產生驗證碼為 :");
		genAuthCode();
	}
}
