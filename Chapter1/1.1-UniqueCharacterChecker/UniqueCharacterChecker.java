Is Unique
Identify if string contains unique characters

What are our use cases?

""	?	false
"abc"	?	true
"abcb"	?	false

package org.markmavromatis

public class UniqueCharacterChecker {

	public boolean hasUniqueCharacters(String aString) {
		boolean hasDuplicate = false;
		int stringLength = aString.length;
		for (int i = 0; i < stringLength; i++) {
			char aCharacter = aString.charAt(i);
			for (int j = i + 1; j < stringLength; j++) {
				if (aCharacter == aString.charAt(j)) {
					hasDuplicate = true;
					break;
				}
			}
			if (hasDuplicate) {
				break;
			}

		}
		return !hasDuplicate;
	}


	public static void main(String[] args) {
		String stringToCheck = args[0];
		System.out.println(hasUniqueCharacters(stringToCheck));		

	}
}


