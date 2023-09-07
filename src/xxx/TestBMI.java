package xxx;

//請建立一個TestBMI.java，並計算自己的BMI值後輸出，另加入判
//斷結果為過瘦、正常或是過重

public class TestBMI {
	public static void main(String[] args) {

	double myWeight = 48 , myHeight = 1.61;
	
	double myBmi = myWeight / (myHeight * myHeight);
	
	
	System.out.printf("BMI : %.2f %n", myBmi);

	   if (myBmi >= 24) {
		   System.out.println("過胖");
	       } else if(myBmi < 18.5) {
		   System.out.println("過瘦");
		   } else {
			   System.out.println("正常");
			   }
		

		
     }
}