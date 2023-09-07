package xxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7 {
	public static void main(String[] args) throws Exception {

		// 1. 請自行建立一個文字檔Sample.txt，內容如下：
//		   請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		   Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		try {
			String filePath = "Sample.txt";
			File myFile = new File(filePath);
			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);

			int byteCount = 0; // 位元計算器
			int charCount = 0; // 字元計算器
			int lineCount = 0; // 行數計算器

			String line = br.readLine();

			while (line != null) {
				lineCount += 1;
				charCount += line.length();
				byteCount += line.getBytes().length;
			}

			System.out.println("Sample.txt檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");

		} catch (IOException e) {
			e.printStackTrace();
		}

//		2. 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//		   append功能讓每次執行結果都能被保存起來)

//		3. 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		   代表的檔案會複製到第二個參數代表的檔案

//		4. 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		   意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

//		5. 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//		   型簡化本題的程式設計)

	}
}
