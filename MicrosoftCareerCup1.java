/*
QUESTION: Given an array of integers when the difference between every two neighbored 
elements is either -1 or +1 or 0. Write an efficient search algorithm to find a 
given number x in the array.

LANGUAGE: Java
*/


public int findEle(int[] arr,int x){

	int firstEle = arr[0];
	int length = arr.length;


	//The element to find is not present in the given array
	if( (x > (arr[0] + (length - 1)))  || (x < (arr[0] - (length - 1))))
		return -1;

	int diff;

	//Current index
	int i = 0;

	while(i < length){
		
		diff = Math.abs(arr[i] - x);

		//Success
		if(diff == 0)
			return i;

		else 
			i += diff;
	}

	//Coudnt find the element in the array
	//Element is not present in the array
	return -1;

}