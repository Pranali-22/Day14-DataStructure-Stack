/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class Queues implements IQueue{

	Nodes<Integer> linkedListForQueue; 
	
	public Queues() {
		this.linkedListForQueue = new Nodes();
	}
	
	// Add nodes to linked list of queue
	public void append(Nodes newNode) {
		linkedListForQueue.addNodeAtEnd(newNode);
	}
	
	//Display all nodes of queue
	public void displayQueue() {
		linkedListForQueue.displayLinkedList();
	}

	//Function for dequeue
	public void dequeue() {
			if(linkedListForQueue == null) {
				System.out.println("Empty Queue");
			}
			else {
				Nodes temp = linkedListForQueue.getHead().getNext();			
				linkedListForQueue.setHead(temp);
				
			}
	}
}
