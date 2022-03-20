package com.example;

import com.example.factory.OsDisplaySystem;
import com.example.factory.OsFactory;
import com.example.factory.OsFileSystem;

public class Main {
	
	public static void main(String[] args) {
		
//		クラス名
		String className = "com.exampl.faactory.Windows.WindowsFaactory";
		
//		Factory生成
		OsFactory factory = OsFactory.getFactory(className);
		
//		DisplaySystem生成
		OsDisplaySystem displaySystem = factory.createDisplaySystem();
		displaySystem.displayOsName();
		displaySystem.displayStr("サンプル");
		
//		FileSystem生成
		OsFileSystem fileSystem = factory.createFileSystem();
		fileSystem.saveFile("sample.txt");
	}
	
}
