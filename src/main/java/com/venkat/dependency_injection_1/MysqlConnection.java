package com.venkat.dependency_injection_1;

public class MysqlConnection implements DataBase {

	@Override
	public String openConnection() {
		return "opened";
	}

}
