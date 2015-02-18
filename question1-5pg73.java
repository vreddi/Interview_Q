/*
QUESTION: Implement a Method to perform basic string compression 
using the counts of repeated characters. For example the string aabccccaaa would
become a2b1c4a3. If the "compressed" string would not become smaller than the original string 
then retrn the original string. You can assume that the string contains only Upper and Lower 
case character between a-z.
*/

//Language: Java

//METHOD 1
//Ok - Ok method, 2nd method has a better runnign time and is the way to go

public String compressString(String str){

	//If legth of string is already 0
	if (str.length() == 0)
		return str;

	char cur = str.charAt(0);
	int count = 1;
	String compressedStr = "";

	for(int i = 1; i < str.length(); i ++){

		//Next character is a repeated character
		if(str.charAt(i) == cur)
			count++;

		//New character arrives
		else{
			compressedStr += "" + cur + count;
			cur = str.charAt(i);
			count = 1;
		}
	}

	if(compressedStr.length() < str.length())
		return compressedStr;

	else
		return str;
}

/* 
The runtime is O(p + k^2), where p is the size of the original string and k is the 
number of sequences. FOr example, if the string is aabccdeeaa, then the string has
three character sequences. It's slow because string concatenation operates in O(n^2) time.
*/

/*
So we would use StringBuffer for a little improvement
*/

//METHOD - 2
//Better Method