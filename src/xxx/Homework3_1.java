package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		
// 1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	 三角形、其它三角形或不是三角形
		
		int[] y = new int[3];
		
		//先創建可以輸入的欄位
		
		System.out.println("請輸入三角形的三邊長 : ");
		Scanner sc = new Scanner(System.in);
		
		
		   for (int i = 0; i < y.length; i++) {
			y[i] =sc.nextInt();
		}
		   Arrays.sort(y);
			
		   if((y[0] + y[1] > y[2])&&(y[0] + y[2] > y[1])&&(y[1] + y[2] > y[0])) {

				if(Math.pow(y[0], 2) + Math.pow(y[1], 2)== Math.pow(y[2], 2)) {
					
					System.out.println("直角三角形");
					
				}else if(y[0]==y[1] && y[1] == y[2]) {
					System.out.println("正三角形");
					
				}else if( y[0]==y[1] || y[1] == y[2] || y[2] == y[0]) {
					
					System.out.println("等腰三角形");
				
				
		   		}else {
			System.out.println("一般三角形");
		    }
		   }else {
			   System.out.println("不是三角形");
		   } 
		
	
//2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息
			int answer = (int)(Math.random() * 10) ;   //電腦隨機選出一個正確答案
			Scanner an = new Scanner(System.in);     //創建一個輸入的欄位，an物件
			int guess ;                               //創建一個猜測值可以儲存的變數(需要用nextInt方法存進去)
			System.out.println("開始猜數字吧!請輸入0~9的整數!");       
			

			do {                                        //做一個至少做一次的迴圈
				guess = an.nextInt() ;                  //guess是用來儲存輸入值的變數
				
				if(guess != answer) {
				System.out.println("猜錯了");
				
				}
			} while (guess != answer);
			
			System.out.println("猜對了");
		
// 3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//   厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	 的號碼與總數
			
		System.out.println("請輸入你討厭的數字(1~9) :");
		Scanner aVenHate = new Scanner(System.in);
		int hate = aVenHate.nextInt();
		System.out.println();

		// 如果hate是1
		// 1、10、11、12、13、14、15、16、17...19、21、31、41
		// 去除的數: 1、i/10==1、i%10==1
		int count = 0;

		for (int i = 1; i <= 49; i++) { // 先知道總共有幾個數可選
			if (i != hate && i / 10 != hate && i % 10 != hate) {
				count += 1;

			}
		}

		int[] choice = new int[count]; // 設定一組可存入所有數字的陣列

		int x = 0; // 陣列的初始索引數設定
		for (int i = 1; i <= 49; i++) { // 再做一次迴圈，將數字放入陣列裡

			if (i != hate && i / 10 != hate && i % 10 != hate) {

				choice[x] = i; // 符合條件的數字放入陣列

				System.out.print(choice[x] + " ");

				if ((x + 1) % 6 == 0) { // (x+1)是一排有幾個元素
					System.out.println(); // 當一排六個元素存滿以後，進行換行
				}

				x++; // 將索引值往下一個單位移動
			}

		}

		System.out.println("總共有" + count + "個數可選");
		
	}


	
	




}
