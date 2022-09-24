/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class Nodes<T extends Comparable<T>> {

	/**
	 * @param args
	 */
	
	 private T key;
	 private Nodes next;
	 private Nodes head; 
	 private Nodes tail;
	 
	 //Parameterized constructor
	 public Nodes(T key) {
	       
	        this.key = key;
	        this.next = null;
	        this.head = null;
	        this.tail = null;
	    }
	   
	 //Non Parameterized constructor
	 public Nodes() {
	    	this.key = null;
	        this.next = null;
	        this.head = null;
	        this.tail = null;
		}
	
	//Function to add node at start of linked list
    public void addNodeAtStart(Nodes newNode)
    {
        if (head == null)
        {
            head = newNode;
            newNode.next = null;
        }else
        {
            Nodes temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println("\nStack after adding "+newNode.key);
    	this.displayLinkedList();
    }
    
	
	//function to display linked list
    public void displayLinkedList()
    {
        if(head == null)
            System.out.println("Empty Linked list");
        else{
        	Nodes<T> node = this.head;
	    	while(node.next != null){	    		
	    		System.out.print(node.key+" -> ");
	    		node = node.next;	    		
	    	}
	    	System.out.print(node.key);
        }
        System.out.println();
    }


}
