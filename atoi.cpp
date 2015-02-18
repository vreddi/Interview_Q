/*
QUESTION: Implement atoi() (with a twist)
DESCRIPTION: Given a string of characters and an integer base, convert the given 
             string into an integer.
             String '11' with base 10 should return 11
             String '11' with base 2  should return 3
             String '11' with base 8 should return 9
             String 'A' with base 16 should return 10
			 
			 For an invalid string return -1

ASSUMPTION: No negative input is given
			Max. base supplied is 16

LANGUAGE: C++
*/

#include <iostream>
#include <math.h>
#include <string.h>
#include <stdio.h>

using namespace std;

int parseInt(char n){

	if( n >= 0 && n <=9)
		return (int)n;

	else if(n == 'A')
		return 10;

	else if(n == 'B')
		return 11;

	else if(n == 'C')
		return 12;

	else if(n == 'D')
		return 13;

	else if(n == 'E')
		return 14;

	else if(n == 'F')
		return 15;

	//Error Case
	else 
		return -1;
}

int myAtoi(char* number, int base){

	//Invalid input string
	//Generate error
	if(number == NULL)
		return -1;

	//Stores the final result
	int res = 0;
	//Stores current character (int form) in the string
	int cur;

	for(int i = 0; i < strlen(number); i++){

		cur = parseInt(number[i]);

		//Invalid String/ Error Case
		if(cur == -1 || cur > base)
			return -1;
		
		else{
			res += cur*pow(base, i);
		}

	}
	//return the final integer result
	return res;

}


int main(int argc, char *argv[]){
	
	//Stores the String to convert into the integer
	char* number = "11";
	//Stores the base for conversion
	int base;

	cout<<"Enter the number string: ";
	//getline(cin, number);

	cout<<endl;

	cout<<"Enter the Base: ";
	cin>> base;

	cout<<endl;

	cout<<"Converted Answer is: "<< myAtoi(number, base);


	return 0;
}