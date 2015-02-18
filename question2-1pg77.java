/*
QUESTION: Write Code to remove duplicates from an unsorted linked list.
		  DO this without using a temporary buffer.

LANGUAGE: Java
*/

public static void deleteDups(node head){

	if(head == null){
		return;
	}

	node current = head;

	while(current != null){

		node runner = current;

		while(runner.next != null){

			if(runner.next.data == current.data){

				//deleting the duplicate node
				runner.next = runner.next.next;
			}

			else{
				runner = runner.next;
			}
		}

		current = current.next;
	}
}