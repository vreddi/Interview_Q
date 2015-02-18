/*
QUESTION: Given two strings, write a method to decide if one 
		  is a permutation of the other.
*/

//Language: Java


//Assuming that the character set of the strings
//is ASCII


//METHOD 1
public String sort(String str){

	char[] input = str.toCharArray();

	//Sorts the input character array
	java.util.Arrays.sort(input);

	//Type casting back to String and returning the
	//sorted string
	return String(input);
}
public boolean permutation(String str1, String str2){

	//If length of both strings is not equal
	//then they definately are not permutations of 
	//each other.
	if(str1.length() != str2.length())
		return false;

	return sort(str1).equals(sort(str2));
}

//METHOD 2

public boolean permutation(String str1, String str2){

	//If length of both strings is not equal
	//then they definately are not permutations of 
	//each other.
	if(str1.length() != str2.length())
		return false;

	//Assuming ASCII Character Set
	//This array keeps count of each character in string 1
	int[] letterCount = new int[128];

	//Stores the value of character
	int charVal;

	for(int i = 0; i < str1.length(); i++){

		charVal = (int)str1.charAt(i);
		
		//Marking and increasing count of that character that is present
		//in String 1
		letter[charVal]++;
	}

	for(int i = 0; i < str2.legnth(); i++){

		charVal = (int)str2.charAt(i);

		letterCount[charVal]--;

		//More character of the same kind in the second string than the first
		if(letterCount[charVal] < 0)
			return false;
	}

	//All False answering cases failed...therefore true
	return true;
}