package com.cts.spring.springcore.propertyplaceholder;

public class myDAO {
	private String dbServer;

	public myDAO(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "myDAO [dbServer=" + dbServer + "]";
	}
	
}
