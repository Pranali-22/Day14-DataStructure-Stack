/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * Ability to create a Queue of
 *	56->30->70
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		//Creating nodes to add to list
		 Nodes<Integer> firstNode = new Nodes<Integer>(56);		 
		 Nodes<Integer> secondNode = new Nodes<Integer>(30);
		 Nodes<Integer> thirdNode = new Nodes<Integer>(70);
		 
		 Queues queueList = new Queues();
		 
		 //Add nodes to queue list
		 queueList.append(firstNode);
		 queueList.append(secondNode);
		 queueList.append(thirdNode);
		 		 
		 //Display all nodes of queue
		 System.out.println("Nodes of queue :");
		 queueList.displayQueue();

	}

}
