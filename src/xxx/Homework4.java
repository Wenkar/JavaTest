package xxx;


import java.util.Scanner;
import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		
//		1.有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		System.out.println("1.");	
			
		int[] r1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(r1);
		int totalCount = 0 ;
		
		for(int x1 = 0 ; x1 < r1.length ; x1++) {
			totalCount += r1[x1];
		}
		
		int average = totalCount / r1.length ;
		System.out.println("所有元素的平均值是 :" + average);
		System.out.println("大於平均值的元素有 : ");
		for(int y1 = 0 ; y1 < r1.length ; y1++) {
			
			if(average - r1[y1] < 0) {
				System.out.print(r1[y1] + " ");
			}
		}
		System.out.println();
		
//		2.請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		System.out.println("2.");
		System.out.println("請輸入一個字串:");
		
		Scanner sc = new Scanner(System.in);
		
		String x2 = sc.nextLine();
		
		int x2_len = x2.length();

		
		for(int i2 = (x2_len -1) ; i2 >= 0 ; i2--) {
			
			System.out.print(x2.charAt(i2));
			
		}
		
		
		
		System.out.println();
		
//		3.有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)
		
		//先知道怎麼算出一個字串裡的a、e、i、o、u
		System.out.println("3.");
		
		char [] vowel = {'a','e','i','o','u'};
		String [] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};

		int count = 0 ;
		
		for(int i = 0 ; i < vowel.length ; i++) {     // i=0   vowel[0] = a
			
			for(int j = 0 ; j < planet.length ; j++) {   //j=0   planet[0] = mercury
					
				for(int k = 0 ; k < planet[j].length() ; k++) {
					
					if (vowel[i] == planet[j].charAt(k)) {
						count++ ;
					}
				}

			}
		}
		
		System.out.println("裡面總共有" + count +"個母音");
		
//		4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示：Scanner，二維陣列)
		System.out.println("4.");
		System.out.println("你想借多少錢?");
		
		
		int borrow = sc.nextInt();
		
		int [][] someone = {{25 , 32 , 8 , 19 , 27},{2500 , 800 , 500 , 1000 , 1200}};
		int people = 0;
		System.out.print("有錢可借的員工編號 :");
		for (int i = 0; i < someone[1].length; i++) {
			if (someone[1][i] > borrow) {
				System.out.print(someone[0][i] + " ");
				people++;
			}
		}
		System.out.print("共" + people + "人");
		
		System.out.println();

//		5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
		System.out.println("5.");
		
		System.out.println("請輸入年分 :");
		
		int year = sc.nextInt();
		
		System.out.println("請輸入月份 :");
		
		//用迴圈來判斷輸入月份是否在1~12的範圍內
		int month ; //一定要先設一個變數在迴圈外，不然其他地方無法使用這變數
		
		while(true) {
			month = sc.nextInt();
			if(month <= 12 && month >= 1) {
				break;
			} else {
			System.out.println("月份格式錯誤，請重新輸入");
		    }
		}
		
		//設定初始日數的陣列，判斷閏年之後，可以把2月的數字直接在這裡做變更
		int [] countDay = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
		
		//判斷是否為閏年，是閏年的話就改2月的天數
		//任何能以 4 整除的年份都是閏年
		//誤差 : 能以100整除的年份，同時也要能以400整除，才算是閏年
		//所以 : 要找出  1. 能被4整除，但不能被100整除的年
		//              2. 能被400整除的年
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			countDay[1] = 29 ;
		}
		
		System.out.println("請輸入日期 : ");
		
		//設迴圈判斷日期是否合規
		int day ;
		while(true) {
			day = sc.nextInt();
			if(day > countDay[(month-1)] || day < 1) {
				System.out.println("日期格式錯誤，請重新輸入 : ");
			} else {
				break ;
			}
		}
		
		//設迴圈加總month的天數
		int totalDay = 0;
		for(int i = 0 ; i < (month-1) ; i++) {
			totalDay += countDay[i] ;
		}
		
		totalDay += day;
		
		System.out.println("輸入的日期為該年第"+ totalDay +"天");
		
		
//		6.班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)
		System.out.println("6.");
		
		int [][] score = {
			   	 {10 , 35 , 40 , 100 , 90 , 85 , 75 , 70},
				 {37 , 75 , 77 , 89 , 64 , 75 , 70 , 95},
				 {100 , 70 , 79 , 90 , 75 , 70 , 79 , 90},
				 {77 , 95 , 70 , 89 , 60 , 75 , 85 , 89},
				 {98 , 70 , 89 , 90 , 75 , 90 , 89 ,90},
				 {90 , 80 , 100 , 75 , 50 , 20 , 99 , 75}
			 	  };

		
		int[] highest_time = new int[8];  //8個人最高分的次數 
		
		for(int m = 0 ; m < score.length ; m++) {
			int highest = 0 ;          //預設一個最高分是0    高於最高分，就取代原本的最高分
				
			
			for(int n = 0 ; n < score[m].length ; n++) {    //第一次內迴圈，找出當次考試的最高分數
				if(score[m][n] > highest) {
					highest = score[m][n];    //比high大就取代他
				}                             
			}                                    //內迴圈結束是考試一次的結束
			
			for(int n = 0 ; n < score[m].length ; n++) {     //第二次內迴圈，找出和最高分一樣的有誰
				if(score[m][n] == highest) {
					
					highest_time[n] += 1;          //最高分的人，高分次數加1
				}
			}
			
		}
		for (int j = 0; j < highest_time.length; j++) {
			
			System.out.println("第"+ (j+1) + "號同學的最高分次數是" + highest_time[j]);
		}
	
	}
	
}