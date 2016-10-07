public class DoubleListNode<T>
{
	// instance properties
	
	private T value;
	private DoubleListNode<T> next;
	private DoubleListNode<T> previous;
	
	
	// constructor
	
	public DoubleListNode (T initValue,
					 		DoubleListNode<T> initNext,
					 		DoubleListNode<T> initPrevious)
	// pre-condition: initValue is a valid Object, initNext is valid 
	//	DoubleListNode and initPrevious is a valid DoubleListNode.
	// post-condition: value equals initValue, next equals initNext and
	//	previous equals initPrevious.
	{
		value = initValue;
		next = initNext;
		previous = initPrevious;
		return;
	}
	
	
	// accessors
	
	public T getValue ()
	// pre-condition: value is either null or a valid Object.
	// post-condition: value is returned.
	{
		return value;
	}
	
	public DoubleListNode<T> getNext ()
	// pre-condition: next is either null or a valid DoubleListNode.
	// post-condition: next is returned.
	{
		return next;
	}

	public DoubleListNode<T> getPrevious ()
	// pre-condition: previous is either null or a valid DoubleListNode.
	// post-condition: previous is returned.
	{
		return previous;
	}
	
	
	// mutators
	
	public void setValue (T theNewValue)
	// pre-condition: theNewValue is a valid Object.
	// post-condition: value equals theNewValue.
	{
		value = theNewValue;
	}
	
	public void setNext (DoubleListNode<T> theNewNext)
	// pre-condition: theNewNext is a valid DoubleListNode.
	// post-condition: next equals theNewNext.
	{
		next = theNewNext;
	}

	public void setPrevious (DoubleListNode<T> theNewPrevious)
	// pre-condition: theNewPrevious is a valid DoubleListNode.
	// post-condition: previous equals theNewPrevious
	{
		previous= theNewPrevious;
	}

}

