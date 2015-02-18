/*
QUESTION: Implement an algorithm to find the kth to the last element
		  in a single linked list.

LANGUAGE: Java
*/

class node{
	
	int data;
	node next;

	public node(){
		next = null;
	}

	public node(int d){
		data = d;
		next = null;
	}
};

//METHOD 1
//Recursive Method 


//if k = 1, then we want the last element
//if k = 2, then we want the second last element
//...

//If we want k = 0 to be the last element then we return -1 in the base case

public static int nthToLast(node head, int k){

	//Check to see if end of the linked list is reached
	//BASE CASE
	if(head == null)
		return 0;

	int i = nthToLast(head.next, k) + 1;
	
	if(i == k)
		System.out.println(head.data);

	return i;

}


//METHOD 2
//Itterative Method

//LENGTH means total length of the Single Linked List (which is not given to us in the question)

// Here we will use 2 pointers pointing at the head.
// We would move the second pointer k nodes away fromt he start. That would be
// LENGTH - k nodes from the end. Now we will move the 2 pointers which are initially
// separated by k nodes at the same pace till the second pointer reaches the end of the linked list.
// So now both pointers would have moved LENGTH - k nodes. The first pointer would be LENGTH - k nodes
// from the start and k nodes from the end and that is what we want.


//Here k = 0 is the last element
// k = 1 is the second last element
//...


//RUNTIME O(n) where n is the size of the linked list
//SPACE O(1)
public static node kthFromTheLast(node head, int k){

	if(head = null)
		return null;

	node p1 = head;
	node p2 = head;


	//getting second pointer to the kth node
	for(i = 0; i < k; i++){

		if(p2.next != null)
			p2 = p2.next;

		else{
			
			System.out.println("Invalid value k with respect to Linked List Size");
			return null;
		}
	}

	if(p2 == null)
		return null;

	//Move both pointers at the same pace
	//till p2 reaches the end
	while(p2.next != null){

		p1 = p1.next;
		p2 = p2.next;
	}

	//First Pointer is the kth node from the end
	return p1;

}
