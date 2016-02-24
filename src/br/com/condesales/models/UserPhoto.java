package br.com.condesales.models;

import java.io.Serializable;

public class UserPhoto implements Serializable {

	private String prefix;
	private String suffix;

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

}
