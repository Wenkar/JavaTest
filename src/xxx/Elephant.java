package xxx;

public class Elephant extends Animal {
	private String name ;
	
	public Elephant(){          
		super();
  }
	
// 這是Elephant預設的建構子，
// 但是因為父類別已經有宣告有參數的建構子，
//	所以在子類別，無參數的建構子就會被報錯

// 但是在父類別特別把預設建構子寫出來以後，
// 在子類別就可以把預設建構子寫出來
// 裡面的super();可寫可不寫
	
	
	public Elephant (int age , float weight , String name) {
		super(age , weight);
		this.name = name ;
	}
	
	@Override   //給編譯器的資訊
                //，讓編譯器對此方法是用override規則檢查(安全)
	
	public void speak() {                       //對Animal的speak()進行覆寫
		super.speak();
		System.out.println("name :"+ name);
	}
	
	
	
	
	
}
