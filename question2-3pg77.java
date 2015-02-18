/*
QUESTION: Implement an algorithm to delete a node in the middle
		  of a singly linked list given only access to that node.

LANGUAGE: Java

*/

public static boolean deleteNode(node ref){

	if(ref == null || ref.next == null){
		return false;
	}

	//if node is somewhere in the middle of the linked list
	ref.data = ref.next.data;
	ref.next = ref.next.next;

	return true;
}

//Deleting the last node in the linked list would not be possible here and would
//end up in a false return. Because we depend on the data of the next node from the 'ref'
//node, thats why we cannot delete the last node as the last node's next has no data. It is null.