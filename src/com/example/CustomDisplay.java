package com.example;

import java.util.List;

public class CustomDisplay extends Display {

//	コンストラクタ
	public CustomDisplay(DbImpl impl) {
		super(impl);
	}
	
//	指定年齢以下の従業員一覧を取得するメソッド
	public void filterAge(int age) {
		List<Employee> employeeList = getEmployeeList();
		
		for(Employee employee: employeeList) {
//			引数以下の年齢かを判定
			if(employee.getAge() <= age) {
				System.out.println(employee);
			}
		}
	}
}
