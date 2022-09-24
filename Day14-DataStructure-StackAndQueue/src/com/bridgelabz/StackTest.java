/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * 
 * Ability to create a Stack of
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

	}

}
