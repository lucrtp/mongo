package com.mongodb.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Mongo {
	private static final String FILENAME = "resources/config.properties";
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle(FILENAME,Locale.getDefault());
		if(bundle!=null)
		{
			System.out.println("get OK");
		}
	}
}
