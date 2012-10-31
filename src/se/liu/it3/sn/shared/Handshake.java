package se.liu.it3.sn.shared;

import java.io.Serializable;

/**
 * N�r en klient vill ansluta m�ste man skicka en handskakning, denna klass allts� ;)
 * 
 */
public class Handshake implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7028811552221331526L;
	long imei;
	User user;
	public Handshake(long imei, User user) {
		this.imei = imei;
		this.user = user;
	}
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}