/*
QUESTION: Implement a function void reverse(char* str) in C or C++
 		  which reverses a null-terminated string.
*/

//Language: C++

 void reverse(char* str){

 	//end points to the beggining of the i/p string
 	char* end = str;

 	//Used for later swapping
 	char temp;

 	//Empty string Condition
 	if(str == NULL)
 		return;

 	//Making end to point at the last character i.e null character
 	while(*end != NULL)
 		end++;

 	//Now end pointer has made a traversal till the null character

 	//This is an 'In-Place' Swap 
 	//Reversing the string inplace
 	while(str < end){

 		temp = *str;
 		*str = *end;
 		*end = temp;

 		//Moving on to the next swap
 		str++;
 		end--;

 	}
 }