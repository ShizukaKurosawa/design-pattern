package com.example;

public interface Item  extends Cloneable{
	
//	アイテムを獲得するメソッド
	public void get();
	
//	アイテムを利用するメソッド
	public void use();
	
//	クローンを生成するメソッド
	public Item createClone();

}
