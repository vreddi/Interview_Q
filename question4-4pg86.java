/*
QUESTION: Given a Binary Tree, design an algorithm which creates a Linked List of all the nodes at each
          depth (eg: If you have a tree with Depth D, you'll have D Linked List)

LANGUAGE: Java
*/

//All the 'D' Linked Lists are stored in an ArrayList and that result ArrayList is returned
//as the answer containing all the 'D' Linked Lists.

//BFS METHOD EXPLAINATION
//Starting with the root, the root is added to a 'current' linked list and then that 'current' linked list
//is made a 'parents' linked list. Then for all the parents (which in the first iteration is just the root),
//All children of all the parents are added to a new freshly created 'current'. And now this 'current' is added
//to the ArrayList and then the current LinkedList becomes the Parents Linked List and the same process repeats until,
//the size of the current LinkedList hits 0. When it does that means that there are no children to be added to a LinkedList
//anymore, and hence we terminate and return the ArrayList full of LinkedLists of Tree-Nodes.

import java.util.LinkedList;
import java.util.ArrayList;


//Binary Tree node
class node{
    
    public int data;
    
    public node left;
    public node right;
    
    public node(){
        
        left = null;
        right = null;
    }
    
    public node(int d){
        
        data = d;
        
        left = null;
        right = null;
    }
    
};


//Iterative BFS Method
public static ArrayList<LinkedList<node>> createLevelLinkedList(node root){
    
    Arraylist<LinkedList<node>> answer = new ArrayList<LinkedList<node>>();
    
    LinkedList<node> current = new LinkedList<node>();
    
    if(root != null)
        current.add(root);
        
    while(current.size() > 0){
        
        answer.add(current);
        
        LinkedList<node> parents = current;
        current = new LinkedList<nodes>;
        
        for(node n : parents){
            
            if(n.left != null){
                current.add(n.left);
            }
            
            if(n.right != null){
                current.add(n.right);
            }
        }
    }
    
    return answer;
}

//RUNNING TIME: O(N)
//SPACE: O(N)