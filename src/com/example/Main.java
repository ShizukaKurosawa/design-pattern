package com.example;

import com.example.factory.Factory;
import com.example.factory.Product;
import com.example.pc.PcFactory;

public class Main {
	
	public static void main(String[] args) {
		
//		Factoryインスタンスの生成
		Factory factory = new PcFactory();
		
//		Productを作る
		Product pc1 = factory.create("A001");
		Product pc2 = factory.create("A002");
		Product pc3 = factory.create("A003");
		
//		改行
		System.out.println();
		
//		Productを使う
		pc1.use();
		pc2.use();
		pc3.use();
		
	}
}
