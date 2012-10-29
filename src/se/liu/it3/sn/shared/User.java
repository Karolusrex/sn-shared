package se.liu.it3.sn.shared;

import java.io.Serializable;



public class User implements Serializable {
	

	private static final long serialVersionUID = 226254645755911593L;
	private String userName;
	private String password;
	
	User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
