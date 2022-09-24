/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * 
 * Ability to peek and
 * pop from the Stack
 * till it is empty
 * 56->30->70
 *
 */
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Nodes<Integer> firstNode = new Nodes<Integer>(56);		 
		 Nodes<Integer> secondNode = new Nodes<Integer>(30);
		 Nodes<Integer> thirdNode = new Nodes<Integer>(70);
	     	        
		 //Creating stack with null node
	     Stacks stack = new Stacks();
	     
	     //Pushing all nodes to stack
	     stack.push(thirdNode);
	     stack.push(secondNode);
	     stack.push(firstNode);
	     
	     //Display Stack
	     System.out.println("Final Stack : ");
	     stack.displayStack();

	     while(stack.linkedList.getHead() != null) {
		     //Display peek element of stack
		     System.out.println("\nPeek of Stack : "+stack.peek());
		     
		     //Pop Element from Stack
		     stack.pop();
		     System.out.println("Final Stack after pop : ");
		     stack.displayStack();
	     }
	     
	}

}
