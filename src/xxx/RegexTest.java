package xxx;

import java.util.Scanner;

public class RegexTest {
	//練習輸入身分證字號驗證
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  //設定輸入鍵
		String id = sc.next();
		
		String regex = "^[A-Z][1-2][0-9]{8}$";  //參考模組28去設定，我自己的寫法
		
		if(id.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}
}
