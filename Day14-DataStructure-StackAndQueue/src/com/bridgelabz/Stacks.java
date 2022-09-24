/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class Stacks implements IStack{

	Nodes<Integer> linkedList;  
	public Stacks() {
		this.linkedList = new Nodes();
	}
	
	// Push node to linkedList at start 
	public void push(Nodes newNode) {
		linkedList.addNodeAtStart(newNode);
	}

	// Display all nodes of linkedList 
	public void displayStack() {
		linkedList.displayLinkedList();
	}

	//Function to peek elements of stack 
	@Override
	public Object peek() {
		if(linkedList.getHead() == null) {
			return null;
		}
		else {
			Nodes temp = linkedList.getHead();
			return temp.getKey();
		}
		
	}

	//Function to pop element from stack 
	@Override
	public void pop() {
		if(linkedList == null) {
			System.out.println("Empty Stack");
		}
		else {
			Nodes temp = linkedList.getHead().getNext();			
			linkedList.setHead(temp);
			
		}
		
	}

		
}
