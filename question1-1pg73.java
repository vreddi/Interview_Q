/*
QUESTION: Implement an algorithm to determine if a string
		  has all unique characters. What if you cannot use additional
		  data structures?
*/

//Language Used: Java

public boolean unique(String str){

	//Pigeon Hole Principle
	//There are total of 128 uniques characters
	//Assumtion: ASCII String and not Unicode
	if(str.length() > 128)
		return false;

	//Stores true in the slot if the character is in the string else false/null
	boolean[] charPresentInString = new boolean[128];

	//Used to store the ASCII value of each character in the string
	int charVal;

	for(int i = 0; i < str.length(); i++){

		charVal = (int)str.charAt(i);

		//By default in java boolean values are NULL
		//If that character is aready present then answer is false
		if(charPresentInString[charVal] && charPresentInString[charVal] != NULL)
			return false;

		//else mark it true and indicated as visited
		else
			charPresentInString[charVal] = true;
	}

	//No case with answer as false occured
	return true;

}

//Time Complexity; O(n) where 'n' is the length of the input string