package xxx;

//請建立一個TestNineNine.java程式，可輸出九九乘法表
//• 一：使用for迴圈 + while迴圈
//• 二：使用for迴圈 + do while迴圈
//• 三：使用while迴圈 + do while迴圈

public class TestNineNine {
	public static void main(String[] args) {
//1.使用for迴圈 + while迴圈
		System.out.println("1.使用for迴圈 + while迴圈");
		
		for(int i1 = 1 ; i1 <= 9 ; i1++) {
			
			int j1 = 1;
			while(j1 <= 9) {
				System.out.print(i1 + "*" + j1 + "=" + i1*j1 + "\t");
				j1++;
			}
			System.out.println();
		}
		System.out.println();
		
		
//2.使用for迴圈 + do while迴圈
		System.out.println("2.使用for迴圈 + do while迴圈");
		
		for (int i2 = 1 ; i2 <= 9 ; i2++ ) {
			int j2 = 1 ;
			do {
				System.out.print(i2 + "*" + j2 + "=" + i2*j2 +"\t");
				j2++ ;
			} while (j2 <= 9);
			
			System.out.println();

		}
		System.out.println();
		
//3.使用while迴圈 + do while迴圈	
		System.out.println("3.使用while迴圈 + do while迴圈");
		
		int i3 = 1;
		while (i3 <= 9) {
			int j3 = 1;
			do {
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
				j3++ ;
			} while (j3 <= 9);
			
			System.out.println();
			i3++ ;
		}
			
		
		
		}

	}

