package fockkoelblschwenzner;

import fockkoelblschwenzner.lang.String;

public interface Cipher {
 
	public abstract String encrypt(String text);
	public abstract String decrypt(String text);
}
 
