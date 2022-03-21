package com.example;

import java.util.ArrayList;
import java.util.List;

public class PostgreDbImpl extends DbImpl {
	
	@Override
	public void connect() {
		System.out.println("Postgresに接続しました");
	}
	
	@Override
	public List<Employee> findAllEmployee() {
		
//		DB接続せずに生成した一覧を返却する
		List<Employee> employeeList = new ArrayList<>();
		
		Employee yamada = new Employee("", 30);
		employeeList.add(yamada);
		Employee tanaka = new Employee("", 23);
		employeeList.add(tanaka);
		
		return employeeList;
	}
	
	@Override
	public void close() {
		System.out.println("Postgrestとの接続をクローズしました");
	}

}
