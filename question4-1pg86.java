/*
QUESTION: Implement a function to check if a binary tree is balanced.
		  For the purposes of this question, a balanced tree is defined to be 
		  a tree such that the height of of the two sub-trees of any node never
		  differ by more than one.

LANGUAGE: Java

RUNTIME: O(n.logn)
		 Not that efficient
*/

//Assuming the node/root of the subree has
//some data and then a left point and a right pointer



public static int getHeight(root r){

	//height is 0
	//Base Case
	if(r == NULL)
		return 0;

	//Recursive case
	else{
		return Math.max(getHeight(r.left), getHeight(r.right)) + 1;
	}
}

pubic static boolean isBalanced(root r){

	//Height of the sub-tree is 0/ i.e height difference is 0
	//Base Case
	if(r == NULL)
		return true;

	int heightDiff;

	heightDiff = getHieght(r.left) - getHieght(r.right);


	//Follows a top to bottom traversing structure within the tree

	if(Math.abs(heightDiff) > 1)
		return false;

	//Recursive Case
	else{
		return isBalanced(r.left) && isBalanced(r.right);
	}
}