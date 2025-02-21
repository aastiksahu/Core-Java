package com.rays.stringProgram;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
	    String name1 = "Prajapati";
	    String name = name1.toLowerCase();
	    
	    for (int i = 0; i < name.length(); i++) {
	        char ch = name.charAt(i);
	        
	        // Check if the character has already been printed
	        boolean isDuplicate = false;
	        
	        // Check if the character is already encountered before
	        for (int j = 0; j < i; j++) {
	            if (name.charAt(j) == ch) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        
	        // If it's not a duplicate, print it
	        if (!isDuplicate) {
	            System.out.print(ch);
	        }
	    }
	}

}