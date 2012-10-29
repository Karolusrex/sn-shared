package se.liu.it3.sn.shared;

import java.io.Serializable;


public class User implements Serializable {
	

	private static final long serialVersionUID = 226254645755911593L;
	private String userName;
	
	// TODO: Vi vill förmodligen inte spara lösenordet så att det skickas runt hejvilt
	private String password;
	
	public User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}

	public boolean equals(Object o){
		if(o instanceof User){
			User u = (User) o;
			return userName.equals(u.getUserName()) && password.equals(u.getPassword());
		}
		return false;
	}
	
	public int hashCode(){
		return userName.hashCode();
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
