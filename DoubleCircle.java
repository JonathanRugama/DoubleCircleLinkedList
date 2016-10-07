import javax.swing.JOptionPane;

/********************************************************************
 * Written by: Ramsey Hatoum
 *  
 *  NOTES:  A doubly linked list is created with the DoubleListNode 
 *  class which has 2 pointers - a next  and a previous.  The
 *  previous pointer points to the node before it in the linked 
 *  list.  In a circular linked list next pointer of the the last 
 *  node in the list points to the head of the list and the 
 *  previous pointer of the head points to the last node in the list.
 *   
 *  ASSIGNMENT:  Use the DoubleListNode class to write a 
 *  program that creates a circular, doubly linked list of 
 *  the letters of the alphabet.  Then let the user input  
 *  a letter and print the list forward and backwards from that 
 *  point.
 *  
 * For example if I input 'V' your program should print:
 *
 *	V W X Y Z A B C D E F G H I J K L M N O P Q R S T U 
 *	V U T S R Q P O N M L K J I H G F E D C B A Z Y X W
 *
 * HAND IN:  Make a jar file of your program, print and put 
 * your jar file in the hand in folder.
 *
*****************************************************************/
public class DoubleCircle 
{
	public static void main(String[] args) 
	{
		char ch = JOptionPane.showInputDialog(null,"Enter a letter of the alphabet").charAt(0);
		DoubleListNode<Character> head = null;
		DoubleListNode<Character> tail = null;
		
		DoubleListNode<Character> p = null; 
	    for(char c = 'A'; c <= 'Z'; c++) {
	        p = new DoubleListNode<Character>(c, null, null);        
	        if (head == null)
	        {
	            p.setNext(p);
	            p.setPrevious(p);
	            head = p;
	            tail = head;
	        }
	        else
	        {
	            p.setPrevious(tail);
	            tail.setNext(p);
	            head.setPrevious(p);
	            p.setNext(head);
	            head = p;    
	        }
		} 
        
	    String front = front(p, ch);
        String back = back(p, ch);
        
        JOptionPane.showMessageDialog(null, front + "\n" + back);
	}
	
	public static String front(DoubleListNode<Character> list, char value) {
		  String str = "";
		  DoubleListNode<Character> first = null;
		    
	      while(first == null) 
	      {
	    	  if (list.getPrevious().getValue() == value) 
	    	  {
	    		  first = list.getPrevious();
	    		  list = first;

	 	          while(list.getPrevious() != first) 
	 	          {
	 	        	  str += list.getValue() + " ";  
	 		          list = list.getPrevious();      	 
	 	          }
	 	          str += list.getValue() + " ";  
	 	          
	 	          break;      	  
	    	  }
	          list = list.getPrevious();
	       }   
	          
		  return str; 
    }
	
	public static String back(DoubleListNode<Character> list, char value) {
		  String str = "";
		  DoubleListNode<Character> first = null;
		    
	      while(first == null) 
	      {
	    	  if (list.getNext().getValue() == value) 
	    	  {
	    		  first = list.getNext();
	    		  list = first;

	 	          while(list.getNext() != first) 
	 	          {
	 	        	  str += list.getValue() + " ";  
	 		          list = list.getNext();      	 
	 	          }
	 	          str += list.getValue() + " ";  
	 	          
	 	          break;      	  
	    	  }
	          list = list.getNext();
	       }   
	          
		  return str;  
  }
}
/*
V W X Y Z A B C D E F G H I J K L M N O P Q R S T U 
V U T S R Q P O N M L K J I H G F E D C B A Z Y X W 
*/