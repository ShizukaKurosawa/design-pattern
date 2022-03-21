package com.example;

public class Mian {
	
	public static void main(String[] args) {
		
//		==================
//		原型を生成
//		==================
		Manager manager = new Manager();
		
//		ポーションの生成
		Potion redPotion = new Potion("");
		manager.register("redPotion", redPotion);
		
		Potion orangePotion = new Potion("");
		manager.register("orangePotion", orangePotion);
		
//		剣の生成
		Sword copperSword = new Sword("銅の剣");
		manager.register("copperSword", copperSword);
		
//		==================
//		クローン生成
//		==================
		Item sword1 = manager.create("copperSword");
		sword1.get();
		sword1.use();
		
		Item potion1 = manager.create("redPotion");
		potion1.get();
		potion1.use();
		
		Item potion2 = manager.create("orangePotion");
		potion2.get();
		potion2.use();
	}

}
