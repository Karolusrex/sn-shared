package se.liu.it3.sn.shared;

import java.io.Serializable;

/**
 * N�r en klient vill ansluta m�ste man skicka en handskakning, denna klass allts� ;)
 * 
 */
public class Handshake implements Serializable{
	long imei;
	User user;
	public Handshake(long imei, User user) {
		this.imei = imei;
		this.user = user;
	}	
}