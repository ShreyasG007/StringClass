package com.tka.stringBuffer;

import java.util.Scanner;

public class StringBuffer_Ex {

	public static void main(String[] args) {
		String s = "The Kiran Academy";
		int i;
		int len = 0, count = 0;
		int vowels = 0, consonant = 0;
		int frequency=0;

		for (i = 0; i < s.length(); i++)
			len++;
		System.out.println("Length of string = " + len);

		System.out.println("Reverse String: ");
		for (i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}

		System.out.println("\nTotal number of characters in the string: " + count);
		String newString = s.toLowerCase();
		System.out.println("\nVowels and Consoant");
		for (i = 0; i < s.length(); i++) {
			if (newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || newString.charAt(i) == 'i'
					|| newString.charAt(i) == 'o' || newString.charAt(i) == 'u') {
				vowels++;
			} else {
				consonant++;
			}

		}

		System.out.println("Count of vowels : " + vowels);
		System.out.println("Count of Consonant : " + consonant);
		
		System.out.println("\nDisplay frequency of given character");
		
		System.out.println("which character you want to search in String");
		try (Scanner scanner = new Scanner(System.in)) {
			char c = scanner.next().charAt(0);
			for (i = 0; i < s.length(); i++) {
				if (newString.charAt(i) == c) {
					frequency++;
				} 
			}
			
			System.out.println("Frequency of given character "+c+ " is : "+frequency);
			
			System.out.println("\nPattern for INDIA String");
			
			String pattString="INDIA";

			 for (i = 0; i < pattString.length(); i++) {
			        for (int j = 0; j <= i; j++) {
			            System.out.print(pattString.charAt(j) + " ");
			        }
			        System.out.println();
			    }
			scanner.close();
		}
	}
}
