package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Hw7 {
	public static void main(String[] args) throws Exception {

		// 1. 請自行建立一個文字檔Sample.txt，內容如下：
//		   請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		   Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		try {
			String filePath1 = "Sample.txt"; // 檔案路徑
			File myFile = new File(filePath1);
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

				line = br.readLine();
			}
			System.out.println("1.");
			System.out.println("Sample.txt檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

//		2. 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//		   append功能讓每次執行結果都能被保存起來)
		try {
			// 設在"C:\THA103_Workspace\JavaTest\src\xxx"同層的txt檔案似乎有權限問題，無法直接寫入
			// 所以換成另外桌面的路徑，就可以成功寫入
			String filePath2 = "C:\\Users\\Tibame_T14\\Desktop\\Java 課程相關\\Data.txt";
			FileWriter fw = new FileWriter(filePath2, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter ps = new PrintWriter(bw);

			// 產生亂數寫入檔案
			int random;
			for (int i = 0; i < 10; i++) {
				random = (int) (Math.random() * 1000) + 1;
				ps.print(random + " ");
			}

			// 依序關閉資源
			ps.close();
			bw.close();
			fw.close();
			System.out.println("2.");
			System.out.println("資料已寫入 " + filePath2);

		} catch (IOException e) {
			e.printStackTrace();
		}

//		3. 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		   代表的檔案會複製到第二個參數代表的檔案
		String originPath = "C:\\Users\\Tibame_T14\\Desktop\\Java 課程相關\\aaa.txt";
		String destinationPath = "C:\\Users\\Tibame_T14\\Desktop\\Java 課程相關\\bbb.txt";
		copyFile(originPath, destinationPath);
		System.out.println("3.");
		System.out.println("檔案已成功複製");

//		4. 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		   意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		System.out.println("4.");

		String folderPath4 = "C:\\data"; // 資料夾路徑
		String filePath4 = "C:\\data\\Object.ser"; // 檔案路徑

		// 創建資料夾
		try {
			Path path = Paths.get(folderPath4);
			Files.createDirectories(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		創建物件
		// 先在Dog、Cat類別加入implements Serializable進行序列化

		Dog dog1 = new Dog("Bob");
		Dog dog2 = new Dog("Stan");
		Cat cat1 = new Cat("Kitty");
		Cat cat2 = new Cat("Milk");

		writeObject(filePath4, dog1);
		writeObject(filePath4, dog2);
		writeObject(filePath4, cat1);
		writeObject(filePath4, cat2);

//		5. 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//		   型簡化本題的程式設計)

		System.out.println("5.");
		String filePath5 = "C:\\data\\Object.ser"; // 檔案路徑
		
		ArrayList<Animal> animal = new ArrayList<>();
		
		
		

	}

//==========第3題的程式=================================	
	public static void copyFile(String originPath, String destinationPath) {
		try {
			File originFile = new File(originPath);
			File destinationFile = new File(destinationPath);

			FileInputStream fis = new FileInputStream(originFile);
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream(destinationFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int bytesRead;

			while ((bytesRead = bis.read()) != -1) {
				bos.write(bytesRead);
				bos.flush();
			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//==========第4題的程式=================================
	public static void writeObject(String filePath, Object object) {
		try {

			// 將物件寫入檔案
			FileOutputStream fos = new FileOutputStream(filePath, true);
			// 這裡另外寫true，是避免前一筆資料被覆蓋過去，僅作添加
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
			oos.close();
			fos.close();

			System.out.println(object + "已被寫入" + filePath);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//==========第5題的程式=================================	



}


