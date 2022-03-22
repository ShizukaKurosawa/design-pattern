package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Unit {
	
//	部署名
	private String name;
	
//	エントリーのList
	private List<Unit> departmentList = new ArrayList<>();

	public Department(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void add(Unit unit) {
		departmentList.add(unit);
	}
	
	@Override
	public void printList(String prefix) {
		
//		ディレクトリ名を表示
		System.out.println(prefix + "/" + this);
//		Listのiterator取得
		Iterator<Unit> it = departmentList.iterator();
		while(it.hasNext()) {
			Unit unit = it.next();
//			再起的な処理
			unit.printList(prefix + "/" + this.name);

		}
	}
}
