package com.test;

public class ReverseString {

	public static void main(String[] args) {
		String str= "RaikAwar";
       
		 String upperCase = str.toUpperCase();
		 String lowerCase = str.toLowerCase();
		/*
		 * StringBuilder builder = new StringBuilder(str);
		 * System.out.println(builder.reverse());
		 */
		/*
		 * char[] charArray = str.toCharArray(); for (int i =charArray.length-1;
		 * i>=0;i--) { System.out.println(charArray[i]); }
		 */
		 
		 System.out.println(str + upperCase + lowerCase);
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
					System.out.println(charArray[i]);
				}
			}
		}
		
	}

}
