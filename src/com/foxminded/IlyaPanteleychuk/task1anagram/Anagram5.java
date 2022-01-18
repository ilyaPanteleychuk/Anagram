package com.foxminded.IlyaPanteleychuk.task1anagram;



public class Anagram5 {

	public static void main(String[] args) {

		String a = reverse("absd5ef4gh");
		System.out.println(a);
	}

	public static String reverse(String inputWords) {

		char[] letters = inputWords.toCharArray();

		StringBuilder reversedString = new StringBuilder();
		for(int i = letters.length - 1; i>= 0; i--) {
			
			if(Character.isLetter(letters[i])) {
				reversedString.append(letters[i]);
			}
			
			
		}
		
		
		for(int i = 0; i<letters.length; i++) {
		
			if(Character.isDigit(letters[i])) {
				
				reversedString.insert(i, letters[i]);
				
			}
			
		}
		
		
		return reversedString.toString();

	}

}
