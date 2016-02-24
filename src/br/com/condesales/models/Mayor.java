package br.com.condesales.models;

import java.io.Serializable;

public class Mayor implements Serializable {
	private int count;
	
	private User user;

	public int getCount() {
		return count;
	}

	public User getUser() {
		return user;
	}
	
}
