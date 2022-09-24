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
	
	public void push(Nodes newNode) {
		linkedList.addNodeAtStart(newNode);
	}

	public void displayStack() {
		linkedList.displayLinkedList();
	}
	
}
