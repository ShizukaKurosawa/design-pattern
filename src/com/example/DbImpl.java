package com.example;

import java.util.List;

public abstract class DbImpl {
	
//	DB接続メソッド
	public abstract void connect();
	
//	従業員一覧（全件）を取得するメソッド
	public abstract List<Employee> findAllEmployee();
	
//	DBクローズメソッド
	public abstract void close();

}
