package xxx;


public class Homework1 {
	public static void main(String[] args) {
		
//1. 請設計一隻Java程式，計算12，6這兩個數值的和與積		
		int num1 = 12 , num2 = 6;
		int plus1 = num1 + num2 ;
		int muti1 = num1 * num2 ;
		
		System.out.println("第一題答案：12和6相加是" + plus1 +",相乘是"+muti1);
		
//2. 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggNum = 200 , box = 12;
		int lastEgg = eggNum % box ;
		int boxEgg = (eggNum - lastEgg) / box ;
		
		System.out.println("第二題答案:200顆蛋共是" + boxEgg + '打' + lastEgg + '顆');
		
//3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec1 = 256559 ;  
		int day2 , hour2 , min2 , sec2 ;
		day2 = (int)(sec1 / (60 * 60 * 24)); //用(int)強迫將浮點數變為整數
		sec1 = sec1 - day2 * 60 * 60 * 24 ; //減去天數所佔的秒數，將sec1重新定義為剩下的秒數
		hour2 = (int)(sec1 / (60 * 60));
		sec1 = sec1 - hour2 * 60 * 60 ; //減去小時數所佔的秒數，再將sec1重新定義為剩下的秒數
		min2 = (int)(sec1 / 60);
		sec2 = sec1 - min2 * 60;
		
		System.out.println("第三題答案:256559秒為" + day2 + '天' + hour2 + "小時" + min2 + '分' + sec2 + '秒');

//4. 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415 ;    //用final來將圓周率設為無法變動的常數
		int r1 = 5;
		double cArea = r1 * r1 * PI ;
		double cFerence = r1 * 2 * PI ;
	    
		cArea = Math.round(cArea * 100.0)/100.0 ;             //使用 Math.round(要簡略的小數*100.0)/100.0 來變成小數後兩位
		cFerence = Math.round(cFerence * 100.0) / 100.0 ;
		
		System.out.println("第四題答案:半徑為" + r1 +"的圓面積為"+ cArea +"，圓周長為" + cFerence);
		
//5. 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)
		int saveNum = 1500000 , saveY = 10 ;
		double rate = 1.02 ;
		int accountNum = (int)(saveNum * Math.pow(rate , saveY));
		
		System.out.println("第五題答案:10年後的本金加利息總共" + accountNum +'元');

//6. 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
		System.out.println("第六題答案:");
		System.out.println(5 + 5);   //兩個都為整數(int)的5，進行相加即為正常的數字運算
		System.out.println(5 + '5'); //單引號內的5是字符(char)，5的ASCII編碼是&#53，當它與整數相加，被強迫變成了整數53，一起做運算
		System.out.println(5 + "5"); //雙引號內的5是字符串(string)，當它與整數相加，整數被變成了字符串，進行了文字上的串接

		
	}
}
