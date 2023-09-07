package xxx;

import java.io.Serializable;

public class Animal implements Serializable{
	int age ;
	float weight ; 
	
	//保留無參數建構子
	public Animal() {
		//1. 給子類別的對應
		//2. 給日後搭配的工具(框架使用),
		//    框架會利用此建構子幫我們建立物件
	}
	
	public Animal(int age , float weight) {
		this.age = age;
		this.weight = weight ;
		
	}
	
	public void speak(){
		System.out.println("age:" + age + "\n" + "weight :" + weight);
	}
	
	public void setAge(int age) {
		this.age = age ;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}

}
