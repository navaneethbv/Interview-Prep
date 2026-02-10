package hackerRank.CodeWhiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Maximum and Minimum
 * Link:https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/maximum-and-minimum
 */
class Student{
	private int token;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	/**
	 * Retrieves token from the data structure.
	 *
	 * @return the computed integer result
	 */
	public int getToken() {
		return token;
	}
	/**
	 * Retrieves fname from the data structure.
	 *
	 * @return the resulting string
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * Retrieves cgpa from the data structure.
	 *
	 * @return the double result
	 */
	public double getCgpa() {
		return cgpa;
	}
}

/**
 * Implementation of Serve The Students algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ServeTheStudents {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalEvents = Integer.parseInt(scanner.nextLine());
		ArrayList<Student> studList=new ArrayList<>();
		for (int i = 0; i < totalEvents; i++) {
			String input=scanner.nextLine();
			if(!input.contains("SERVED"))
			{
				String inputArray[]=input.split(" ");
				String name=inputArray[1];
				double cgpa=Double.parseDouble(inputArray[2]);
				int token=Integer.parseInt(inputArray[3]);
				Student student=new Student(token,name,cgpa);
				studList.add(student);
			}
			else{
				if(studList.size()>0){
					Collections.sort(studList,new StudentComparator());
					studList.remove(0);
				}
			}
		}
		if(studList.isEmpty())
			System.out.println("EMPTY");
		for (int i = 0; i < studList.size(); i++) {
			System.out.println(studList.get(i).getFname());
		}
	}

}
class StudentComparator implements Comparator<Student>{

	@Override
	/**
	 * Performs compare operation.
	 *
	 * @param o1 the o1 parameter
	 * @param o2 the o2 parameter
	 * @return the computed integer result
	 */
	public int compare(Student o1, Student o2) {
		if(o1.getCgpa()>o2.getCgpa())
			return -1;
		else if(o1.getCgpa()<o2.getCgpa())
			return 1;
		else {
			if(!o1.getFname().contentEquals(o2.getFname()))
			{
				// Recursively process left and right subtrees
				return o1.getFname().compareTo(o2.getFname())>0?1:-1;
			}
			else{
				return o1.getToken()>o2.getToken()?1:-1;
			}
		}
	}
}
