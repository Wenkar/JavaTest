package xxx;

//1. 請新增一個Student類別，並宣告一個屬性為score，型別為int，另宣告兩
//個方法分別為play()與study()，功能如下：
//• public void play(int hours)
//每休息一個小時，score就會減1
//• public void study(int hours)
//每讀書一個小時，score就會加1
//2. 該類別完成後，請在main方法裡創建兩個student物件，並藉由呼叫play()
//與study()並取得分數是否正確



public class Student {
	
	int score = 80 ;
	
	
	public void play (String name , int hours) {
			score -= hours ; 
			System.out.println(name + "的分數是" + score);
		}
		
	public void study (String name , int hours) {
			score += hours ;
			System.out.println(name + "的分數是" + score);
		}
	
	public static void main(String[] args) {
		Student A = new Student();
		Student B = new Student();
		A.play("David", 6);
		B.study("Carol", 9);
	}
		
	
	
}

