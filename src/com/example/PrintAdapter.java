package com.example;

public class PrintAdapter extends Show implements Print {
	
//	画面に文字を表示するメソッド
	public void printStr(String str) {
		System.out.println("===================");
		showStr(str);
		System.out.println("===================");
	}
	
//	入力された数値を表示するメソッド
	public void printNumber(int value) {
		System.out.println("--------");
		showNumber(value);
		System.out.println("--------");
	}
	
}

//委譲を利用した実装方法
//public class PrintAdapter implements Print {
	
//	Show show;
	
//	コンストラクタ
//	public PrintAdapter() {
//		super();
//		show = new Show();
//	}
	
//	画面に文字を表示するメソッド
//	public void printStr(String str) {
//		System.out.println("===================");
//		showStr(str);
//		System.out.println("===================");
//	}
	
//	画面に数値を表示するメソッド
//	public void printNumber(int value) {
//		System.out.println("--------");
//		showNumber(value);
//		System.out.println("--------");
//	}

//}