package com.tka.stringExample;

public class StringOperation {
	public int calculateLength(String str) {
		int length = str.length();
		return length;
	}

	public char getSpecificChar(String str, int index) {
		char ch = str.charAt(index);
		return ch;
	}

	public String getSubString(String str, int beginIndex, int endIndex) {
		String newString = str.substring(beginIndex, endIndex);
		return newString;
	}

	public String getToLowerCase(String str) {
		String lowerCaseString = str.toLowerCase();
		return lowerCaseString;
	}

	public String getToUpperCase(String str) {
		String upperCaseString = str.toUpperCase();
		return upperCaseString;
	}

	public int getCompareTo(String str, String compareString) {
		int isSame = str.compareTo(compareString);
		return isSame;
	}

	public byte[] getBytes(String str) {
		byte[] b = str.getBytes();
		return b;

	}

	public boolean getEqualIgnoreCase(String str, String cmpString) {
		boolean b = str.equalsIgnoreCase(cmpString);
		return b;
	}

	public String getTrimMethod(String str) {
		String newStr = str.trim();
		return newStr;
	}
}
