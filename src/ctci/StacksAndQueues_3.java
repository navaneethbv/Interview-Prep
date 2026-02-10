package ctci;

import java.util.ArrayList;
import java.util.Stack;



/*Implementation of CTCI 3.3*/
/**
 * Implementation of Stacks And Queues_3 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueues_3{
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		SetOfStacks setOfStacks=new SetOfStacks();
		setOfStacks.push(10);
		setOfStacks.push(20);
		setOfStacks.push(30);
		setOfStacks.push(40);
		System.out.println("Size is"+setOfStacks.getCurrentStackIndex());
		setOfStacks.push(50);
		setOfStacks.push(60);
		System.out.println("Size is"+setOfStacks.getCurrentStackIndex());
		System.out.println("Popped value is"+setOfStacks.pop());
		System.out.println("Popped value is"+setOfStacks.pop());
		setOfStacks.push(50);
		setOfStacks.push(60);
		setOfStacks.push(70);
		setOfStacks.push(80);
		System.out.println(setOfStacks.popAt(1));
		System.out.println(setOfStacks.popAt(1));
		System.out.println(setOfStacks.popAt(1));
		System.out.println(setOfStacks.popAt(0));
		System.out.println("Size is"+setOfStacks.getCurrentStackIndex());
		
	}
}
class SetOfStacks{
	ArrayList<Stack<Integer>> stackList=new ArrayList<Stack<Integer>>();
	int stackSize=5;
	Stack<Integer> mainStack;
	public SetOfStacks() {
		mainStack=new Stack<Integer>();
		stackList.add(mainStack);
	}
	/**
	 * Retrieves current stack index from the data structure.
	 *
	 * @return the computed integer result
	 */
	public int getCurrentStackIndex(){
		return stackList.size();
	}
	/**
	 * Performs push operation.
	 *
	 * @param value the value value
	 */
	public void push(int value){
		if(stackList.get(stackList.size()-1).size()<5)
		{
			stackList.get(stackList.size()-1).push(value);
		}
		else{
			mainStack=new Stack<Integer>();
			stackList.add(mainStack);
			mainStack.push(value);	
		}
	}
	/**
	 * Performs pop operation.
	 *
	 * @return the computed integer result
	 */
	public int pop(){
		if(stackList.size()>0)
		{	
			int index=stackList.size()-1;
			while(stackList.get(index).size()==0){
				stackList.remove(index);
				index=index-1;
			}
			// Recursively process left and right subtrees
			return stackList.get(index).pop();
		}
		return 0;
	}
	/**
	 * Performs popAt operation.
	 *
	 * @param index the index parameter
	 * @return the computed integer result
	 */
	public int popAt(int index){
		int value=0;
		if(stackList.get(index).size()==1){
			value=stackList.get(index).pop();
			stackList.remove(index);
			return value;
		}
		else{
			return stackList.get(index).pop();
		}
	}
}
