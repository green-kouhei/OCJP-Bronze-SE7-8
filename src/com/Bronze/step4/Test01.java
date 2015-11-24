package com.Bronze.step4;

public class Test01 {

	public static void main(String[] args) {
		//int i = 0;
		loop1:
		for(int i = 0;i<5;i++){
			for(int i2 = 0;i2<5;i2++)
		//if(i == 3)
			break loop1;
		System.out.println(i);
		}
	loop2:
		System.out.println("ぬけた");;
		
		
		//System.out.print(i);
	}

}
