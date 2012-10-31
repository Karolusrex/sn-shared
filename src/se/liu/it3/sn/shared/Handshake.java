package se.liu.it3.sn.shared;

import java.io.Serializable;

/**
 * När en klient vill ansluta måste man skicka en handskakning, denna klass alltså ;)
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