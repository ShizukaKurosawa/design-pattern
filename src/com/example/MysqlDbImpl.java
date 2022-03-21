package com.example;

import java.util.ArrayList;
import java.util.List;

//MySQL用クラス
public class MysqlDbImpl extends DbImpl {
	
	@Override
	public void connect() {
		System.out.println("MySQLに接続しました");
	}
	
	@Override
	public List<Employee> findAllEmployee() {
//		DBに接続せずに生成した一覧を返却する
		List<Employee> employeeList = new ArrayList<>();
		
		Employee yamada = new Employee("", 30);
		employeeList.add(yamada);
		Employee tanaka = new Employee("", 23);
		employeeList.add(tanaka);
		
		return employeeList;
	}
	
	@Override
	public void close() {
		System.out.println("MySQLとの接続をクローズしました");
	}

}
