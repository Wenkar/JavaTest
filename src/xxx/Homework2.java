package xxx;

public class Homework2 {

	public static void main(String[] args) {
//		1. 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum1 = 0;
		for (int num1 = 1; num1 <= 1000; num1++) {

			if (num1 % 2 == 0) {
				sum1 += num1;
			}

		}
		System.out.println("第一題答案 : 1~1000的偶數和是" + sum1 + "\n");

//		2. 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for (int num2 = 1; num2 <= 10; num2++) {
			sum2 *= num2;
		}
		System.out.println("第二題答案 : 1～10的連乘積為" + sum2 + "\n");

//		3. 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum3 = 1;
		int num3 = 1;
		while (num3 <= 10) {
			sum3 *= num3;
			num3++;
		}
		System.out.println("第三題答案 : 1～10的連乘積為" + sum3 + "\n");

//		4. 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int i = 1;
		System.out.println("第四題答案 :");
		for (int j = 1; j <= 10; j++) {
			System.out.print(i * j + " ");
			i++;
		}
		System.out.println("\n");

//		5. 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int lotNum;
		int count5 = 0;
		System.out.println("第五題答案 :");
		System.out.println("可選擇的數字");
		for (lotNum = 1; lotNum <= 49; lotNum++) {

			if (lotNum % 10 != 4 && (int)(lotNum / 10) != 4) {
				
				System.out.print(lotNum + " ");
				count5++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count5 + "個數字" + "\n");

//		6. 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1

		System.out.println("第六題答案 : ");

		for (int i6 = 10; i6 >= 1; i6--) {
			int j6 = 1;
			for (j6 = 1; j6 <= i6; j6++) {
				System.out.print(j6 + " ");
			}
			System.out.println();
		}
		System.out.println();

//		7. 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF

		System.out.println("第七題答案 :");

		for (int i7 = 1; i7 <= 6; i7++) {         // 大迴圈先設定有六列

			char n7;                             // 定義一個字符變數

			for (int j7 = 1; j7 <= i7; j7++) {   // 小迴圈設定欄數，隨著i7遞增

				switch (i7) {                    // 設定隨著每一列i7的值改變，字符也改變
				case 1:
					n7 = 'A';
					break;
				case 2:
					n7 = 'B';
					break;
				case 3:
					n7 = 'C';
					break;
				case 4:
					n7 = 'D';
					break;
				case 5:
					n7 = 'E';
					break;
				default:
					n7 = 'F';
				}
				System.out.print(n7);
			}

			System.out.println();
		}

	}
}
