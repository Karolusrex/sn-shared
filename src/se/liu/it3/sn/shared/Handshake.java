package se.liu.it3.sn.shared;

import java.io.Serializable;

/**
 * När en klient vill ansluta måste man skicka en handskakning, denna klass alltså ;)
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