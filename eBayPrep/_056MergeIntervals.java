package eBayPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class _056MergeIntervals {

	public static class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}

	public static void main(String[] args) {



		ArrayList<Interval> aList=new ArrayList<>();
		aList.add(new Interval(1, 4));
		aList.add(new Interval(0,4));
		//aList.add(new Interval(8, 10));
		//aList.add(new Interval(15, 18));
		aList=(ArrayList<Interval>) merge(aList);
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i).start+"///"+aList.get(i).end);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Interval> merge(List<Interval> intervals) {
		Stack<Interval> stack=new Stack<>();
		List<Interval> outputList=new ArrayList<>();
		Collections.sort(intervals,new Comparator<Interval>() {

			@Override
			public int compare(Interval a, Interval b) {
				if(a.start!=b.start)
					return a.start-b.start;
				else
					return a.end-b.end;
			}
		});


		for (int i = 0; i < intervals.size(); i++) {
			Interval currInterval=intervals.get(i);
			if(stack.isEmpty())
			{
				stack.push(currInterval);
			}
			else{
				if(currInterval.start>stack.peek().end)
				{
					stack.push(currInterval);
				}
				else{
					Interval poppedInterval=stack.pop();
					poppedInterval.end=Math.max(poppedInterval.end, currInterval.end);
					stack.push(poppedInterval);
				}
			}		
		}

		while(!stack.isEmpty())
		{
			outputList.add(stack.pop());
		}
		return outputList;	
	}
}

