package xxx;

import java.util.Iterator;

//1.請建立一個Test4Numbers.java，可輸出0～100裡4的倍數

public class Test4Numbers {
	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");     // println 結果會顯示換行
				                              // 變成 print 結果就會直向排列
				                              // + " " 就可以把顯示的結果隔開   
			}
		}
	}

}
