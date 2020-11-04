/**
 * File Name: Patient.java<br>
 * Purpose: To create patient objects with the attributes
 * firstName, lastName, illness and severity<br>
 * Created: 04/04/20<br>
 * Modified: 04/04/20<br>
 * Copyright: No Copyright<br>
 * @author Morgan Firkins<br>
 * @version 1.0
 */
public class Patient implements Comparable<Patient> {
	private String firstName;// defines firstName attribute of patient
	private String lastName;// defines lastName attribute of patient
	private String illness;// defines illness attribute of patient
	private int severity;// defines severity attribute of patient
	
	/**
	 * Purpose: Constructs a patient object
	 * @param firstName: Stores first name of patient
	 * @param lastName: Stores last name of patient
	 * @param illness: Stores the illness that the patient has
	 * @param severity: Stores the severity of the illness
	 */
	public Patient(String firstName, String lastName, String illness, int severity) {
		setFirstName(firstName);
		setLastName(lastName);
		setIllness(illness);
		setSeverity(severity);

	}
	/**
	 * Purpose: Returns the first name of the patient
	 * @return firstName:String: first name attribute of patient object
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * Purpose: sets the first name of the patient
	 * @param firstName:String: input of what to set first name to 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Purpose: Returns the last name of the patient
	 * @return lastName:String: last name attribute of patient object
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * Purpose: Sets the last name of the patient
	 * @param lastName:String: input of what to set the last name to
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Purpose: Returns the illness of the patient
	 * @return illness:String: illness attribute of the patient object
	 */
	public String getIllness() {
		return this.illness;
	}
	/**
	 * Purpose: Sets the illness of the patient
	 * @param illness: String: input of what to set the illness to
	 */
	public void setIllness(String illness) {
		this.illness = illness;
	}
	/**
	 * Purpose: Returns the severity of the illness of the patient
	 * @return severity: integer: severity of the illness of 
	 * the patient object
	 */
	public int getSeverity() {
		return this.severity;
	}
	/**
	 * Purpose: Sets the severity attribute of the patient
	 * @param severity: integer: input of what to set the severity to
	 */
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	/**
	 * Purpose: compare the patient objects to figure out the
	 * priority of each of the objects within the queue
	 * @return integer
	 * @param otherPatient: Patient Object: selects another
	 * patient object to compare severity against
	 */
	public int compareTo(Patient otherPatient) {
		/**
		 * if the severity of current patient object is greater
		 * than the severity of the other patient object then
		 * return -1<br>
		 * if the severity of the current patient object is less
		 * than the severity of the other patient object then
		 * return +1<br>
		 * if the severity of both objects are the same then
		 * return 0
		 */
		if (this.getSeverity() > otherPatient.getSeverity()) {
			return -1;
		} else if (this.getSeverity() < otherPatient.getSeverity()) {
			return +1;
		} else {
			return 0;
		}
	}
}
