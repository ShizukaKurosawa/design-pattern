package com.example;

public class Singleton {
	
//	staticを生成
	private static Singleton singleton = new Singleton();
	
//	コンストラクタ
	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}
	
//	インスタンス取得用のstaticメソッド
	public static Singleton getInstance() {
		return singleton;
	}

}
