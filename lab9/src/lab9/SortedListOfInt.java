package lab9;


public class SortedListOfInt {
	/* This is to show how you may approach Lab 9
	 * Without using recursion, I have defined method addInteger(int x) which adds
	 * x into a sorted list.
	 * I have defined a toString method to display all elements in a list.
	 * This uses a recursive method displayList.
	 * Your methods should use an approach like mine.
	 */
	ListGeneral myList = new ListGeneral();
	
	public void addInteger(int newElement){
		boolean positionToInsertNewElementNotFound = true; 
		int currentValue;
		/*
		 *  variable positionToInsertNewElementNotFound will be set to false when 
		 *  we have 
		 *       a) found a node in myList which has variable value  greater than newElement. 
		 *       	At this stage we can insert a node containing newElement before this node, or
		 *       b) reached the end of the list. At this stage
		 *       	we can insert a node containing newElement to become the last elements in the linked 
		 *          list. 
		 */
		myList.restart();
		while (positionToInsertNewElementNotFound){
			if (myList.endOfList()){
				positionToInsertNewElementNotFound = false;
			} else{
				currentValue = (Integer) myList.currentValue(); // currentValue returns an object of type Object
				if (currentValue >= newElement){
					positionToInsertNewElementNotFound = false;
				} else {
					myList.getNextNode(); // Note that since endOfList() is false, getNextNode will not return false;
				}
			}
		}
		myList.addBeforeCurrent(newElement); // I used automatic boxing of int into Innteger
	}
	
	private String displayList(){
		int valueInCurrentNode;
		if (myList.endOfList()){
			return ""; // If list is empty return an empty string
		} else {
			valueInCurrentNode = (Integer) myList.currentValue(); 
			/*
			 *  This cast was not really needed since I could have worked directly with the
			 *  the value returned by myList.currentValue()
			 */
			myList.getNextNode();                                                     
			return  valueInCurrentNode + "\n" + displayList();
		}
	}
	
	public String toString(){
		/* 
		 * This method returns a string containing all elements in the list - one element in each line.
		 * This  
		 */
		myList.restart();
		return displayList();
	}
	
	private int temp;
	
	public void addElement(int x){
		if(myList.listIsEmpty()){
			myList.addAfterCurrent(x);
			myList.restart();
		}else if(myList.endOfList()){
			myList.addBeforeCurrent(x);
			myList.restart();
		}else if((int)myList.currentValue() <= x){
			myList.getNextNode();
			addElement(x);
		}else if((int)myList.currentValue() >= x){
			myList.addAfterCurrent(x);
			myList.restart();
		}
	}
	
	private String list = "";
	private boolean restart1 = false;
	private boolean restart2 = false;
	
	public String retrieve(int lowerLim, int upperLim){
		if(myList.endOfList()) return list;
		if(restart1==false){
			myList.restart();
			restart1 = true;
			return retrieve(lowerLim,upperLim);
		}
		if((Integer)myList.currentValue() >= lowerLim && (Integer)myList.currentValue() <= upperLim){
			list = list + myList.currentValue() + " ";
			myList.getNextNode();
			return retrieve(lowerLim,upperLim);
		}else{
			myList.getNextNode();
			return retrieve(lowerLim,upperLim);
		}
	}
	
	
	public static void main(String args[]){ 
		int testData[] = {5, 2, 7, 8, 3, 6,  10, 2, 6};
		int numberOfElementsDeleted = 0;
		SortedListOfInt myList = new SortedListOfInt();
		myList.addElement(10);
		myList.addElement(6);
		myList.addElement(8);
		System.out.println("The values in the sorted list are given below");
		System.out.println(myList.retrieve(0,10));
		
		
	}
}