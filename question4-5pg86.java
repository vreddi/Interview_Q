/*
QUESTION: Implement a function to check if a Binary Tree is a Binary Search Tree

LANGUAGE: Java
*/


import java.util.Integer;

//Check CTCI for explaination of this method. Its properly defined and clears all doubt on why to pick
//MIN and MAX. THe idea basically is that we need a node in a BST to be larger than all the nodes to its left
//and not only larger to its parent. Similarly we need a node in a BST to be smaller than all the nodes to its 
//right.



//METHOD 1
//MIN - MAX RECURSION METHOD
public static boolean CheckBST(node root){
    
    return checkBST(root, null, null);
}

public static boolean checkBST(node root, Integer min, Integer max){

    if(root == null){
        return true;
    }
    
    
    //node why it is <=
    //The left child node in a BST can be <= to its parent
    if(min != null && root.data <= min){
        return false;
    }
    
    if(max != null && root.data > max){
        return false;
    }
    
    if(!checkBST(root.left, min,root.data) || !checkBST(root.right, root.data, max)){
        return false;
    }
    
    return true;
}

//METHOD 2
//IN-ORDER TRAVERSAL METHOD


class node{

    int data;
    node left;
    node right;
    
    public node(){
        
        left = null;
        right = null;
    }
    
    public node(int d){
        
        data = d;
        left = null;
        right = null;
    }
    
    //Finds the total nodes in the tree whose root is 'root'
    public int totalNodes(node root){
        
        /*......*/
    }
};

public int index = 0;

public static void checkBST(node root, int arr[]){
    
    if(root == null)
        return 
    
    checkBST(root.left, arr);
    arr[index] = root.data;
    index++;
    checkBST(root.right, arr);
    
}

public static boolean CheckBST(node root){
    int[] arr = new int[root.totalNodes()];
    createInOrder(root, arr);
    
    for(int i = 0; i < arr.length - 1; i++){
        
        if(a[i] > a[i + 1])
            return false;
    }
    
    return true;
    
}