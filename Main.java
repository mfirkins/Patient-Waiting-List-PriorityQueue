import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * File Name: Main.java<br>
 * Purpose: To read in the supplied text file and to test
 * if the program should work as intended by using the Patient
 * class<br>
 * Created: 04/04/20<br>
 * Modified: 04/04/20<br>
 * Copyright: No Copyright<br>
 * @author Morgan Firkins<br>
 * @version 1.0
 
 */
public class Main {
	/**
	 * Purpose: To read in the supplied text file and to test if the
	 * program works as intended and tests the methods within the
	 * Patient class
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		PriorityQueue<Patient> patientQueue = new PriorityQueue<Patient>();//creates new priority queue
		File txtFile = new File("patients.txt");//reads in text file
		Scanner fileIn = new Scanner(txtFile);//reads in content of file
		
		/**
		 * while the text file has more lines to be read
		 */
		while (fileIn.hasNextLine()) {
			String firstName = fileIn.nextLine();
			String lastName = fileIn.nextLine();
			String illness = fileIn.nextLine();
			int severity = fileIn.nextInt();
			fileIn.nextLine();
			patientQueue.add(new Patient(firstName, lastName, illness, severity));//call the patient constructor to create a new patient
		}
		fileIn.close();
		/**
		 * while the patientQueue is not empty<br>
		 * prints the contents of the priorityQueue
		 */
		while (!patientQueue.isEmpty()) {
			Patient element = patientQueue.remove();//remove the top element of the queue
			System.out.print(element.getFirstName());
			System.out.print(" ");
			System.out.print(element.getLastName());
			System.out.print(": ");
			System.out.print(element.getIllness());
			System.out.println(" ");
			System.out.println(element.getSeverity());

		}

	}
	/*
	 * Hard Coded Patient Objects - You can use this to test constructors
	 * and methods without the text file input
	 * Patient p1 = new Patient("Adam","Bush","Headache",1); 
	 * Patient p2 = new Patient("Joe","Bloggs","Head Injury",4); 
	 * Patient p3 = new Patient("John","Appleseed","Broken Ankle", 3);
	 */
	/*
	 * Test Setters and Getters 
	 * System.out.println(p1.getFirstName());
	 * System.out.println(p1.getLastName()); System.out.println(p1.getIllness());
	 * System.out.println(p1.getSeverity()); p1.setFirstName("Jacob");
	 * p1.setLastName("Booth"); p1.setIllness("Amputated Arm"); p1.setSeverity(5);
	 * System.out.println(p1.getFirstName()); System.out.println(p1.getLastName());
	 * System.out.println(p1.getIllness()); System.out.println(p1.getSeverity());
	 */
	/*
	 * Add hard coded patient objects to priority queue 
	 * patientQueue.add(p1);
	 * patientQueue.add(p2); 
	 * patientQueue.add(p3);
	 */
}
