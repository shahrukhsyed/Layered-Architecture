package com.cg.eis.service;

public interface Validator {
	String idPattern = "[0-9]*";
	String namePattern = "[A-Za-z]*+[ ]*+[A-Za-z]*+[ ]*+[A-Za-z]*";
	String salPattern = "[1-9][0-9]*+[.]*+[0-9]*";
	String pattern1 = "System Associate";
	String pattern2 = "Programmer";
	String pattern3 = "Manager";
	String pattern4 = "Clerk";
	
	public static boolean validateData(String data, String pattern) {

		return data.matches(pattern);
	}
	public static boolean compareData(String data) {
		
		return (data.matches(pattern1)||data.matches(pattern2)||data.matches(pattern3)||data.matches(pattern4));
	}
}