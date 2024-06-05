package com.tka.stringExample;

public class TestString {
	public static void main(String[] args) {
		StringOperation stringOperation = new StringOperation();
		String str = "TheKiranAcademy";

		int length = stringOperation.calculateLength(str);
		System.out.println("Length of " + str + " : " + length);

		char ch = stringOperation.getSpecificChar(str, 5);
		System.out.println("\nSpecific character " + str + " and position is 5 = " + ch);

		String newString = stringOperation.getSubString(str, 3, 8);
		System.out.println("\nOriginal String : " + str + "  Sub String : " + newString);

		String lowerCaseString = stringOperation.getToLowerCase(str);
		System.out.println("\nOriginal String : " + str + "  lower case String : " + lowerCaseString);

		String upperCaseString = stringOperation.getToUpperCase(str);
		System.out.println("\nOriginal String : " + str + "  Upper case String : " + upperCaseString);
		
		String compareString = "TheAbkAcademy";
		int res = stringOperation.getCompareTo(str, compareString);
		System.out.println("\nGet Comapre method :"+res);
		
		byte[] b =stringOperation.getBytes(str);
		for (int i = 0 ;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		boolean isEqual=stringOperation.getEqualIgnoreCase(str,compareString);
		System.out.println("\nOriginal String : "+ str + " Compare String : "+compareString+ " is "+isEqual );
		
		String newStr = "      TheKiranAcademy       ";
		System.out.println("The length of "+newStr+" before trim : "+newStr.length());
		String trimString = stringOperation.getTrimMethod(newStr);
		System.out.println("The length of "+newStr+" After trim : "+trimString.length());
		
		StringBuilder stringBuilder = new StringBuilder("Hello World");
		StringBuilder nw =  stringBuilder.reverse();
		
		System.out.println(nw);
	}
}
