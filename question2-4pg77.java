/*
QUESTION: Write Code to partition a linked list around a value 'x',
		  such that all nodes less than 'x' come before all nodes greater than
		  or equal to x.

LANGUAGE: Java
*/

//DS
class node{

	public int data;
	public node next;

	public node(){
		next = null;
	}

	public node(int d){
		data = d;
		next = null;
	}
};


//METHOD 1
public static node partition(node head, int x){

	node beforeStart = null;
	node beforeEnd = null;
	node afterStart = null;
	node afterEnd = null;

	node it = head;

	while(it != null){

		node next = it.next;
		it.next = null;		//so that there is not next pointer when we creat the new list

		//Data less than x
		if(it.data < x){

			if(beforeStart == null){

				beforeStart = it;
				beforeEnd = it;
			}

			else{

				beforeEnd.next = it;
				beforeEnd = it;
			}
		}

		//Data more than or equal to x
		else{

			if(afterStart == null){

				afterStart = it;
				afterEnd = it;
			}

			else{

				afterEnd.next = it;
				afterEnd = it;
			}
		}
		
		//iterating to the next node
		it = next;
	}

	if(beforeStart == null){
		return afterStart;
	}

	//now merging time
	beforeEnd.next = afterStart;
	afterEnd.next = null;

	//return new head
	return beforeStart;
}



//METHOD 2

public static node partition(node start, int x){

	node head = start;
	node tail = start;

	while(start != null){

		node next = start.next;
		start.next = null;

		//Insert at Head
		if(start.data < x){

			start.next = head;
			head = start;
		}

		//Insert at Tail
		else{

			tail.next = start;
			tail = start;
		}

		start = next;
	}

	//terminating linked list
	tail.next = null;

	//returning new head
	//the head has changed so we need to return the new head to the user
	return head;
}