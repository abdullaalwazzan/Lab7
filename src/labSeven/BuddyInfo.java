package labSeven;

import java.util.*;

public class BuddyInfo {
	// instance variables

	private String buddyName = "";

	private int age;

	private String number = "";

	// Constructors

	/**
	 * 
	 * Default constructor,
	 * 
	 * sets the instance variables to default values
	 * 
	 */

	public BuddyInfo() {

		this("Abdulla Al-wazzan", 24, "819-5933339");

	}
	
	/**
	 * creates a clone of existing buddy object
	 * 
	 * @param tempBuddy
	 */
	public BuddyInfo(BuddyInfo tempBuddy) {
		this(tempBuddy.getName(), tempBuddy.getAge(), tempBuddy.getNumber());
	}

	/**
	 * 
	 * Creates a Buddy with desire info
	 * 
	 * @param name
	 * 
	 * @param age    Please enter in the form "24"
	 * 
	 * @param number
	 * 
	 */

	public BuddyInfo(String name, int age, String number) {

		if ((name == null) && (number == null)) {

			throw new NullPointerException("Please enter all fields.");

		}

		else {

			this.buddyName = name;

			this.age = age;

			this.number = number;

		}

	}

	// name accessors and mutators

	/**
	 * 
	 * Edits a Buddy's name
	 * 
	 * @param name, Buddy's NEW name
	 * 
	 */

	public void setName(String newName) {

		buddyName = newName;

		System.out.println("new name is " + this.getName());

	}

	/**
	 * 
	 * Returns the Buddy's name
	 * 
	 * @return name
	 * 
	 */

	public String getName() {

		return buddyName.toString();

	}

	// age accessors and mutators

	/**
	 * returns true if Buddy is 18 or over.
	 * 
	 * @return
	 */
	public boolean isOver18() {
		return (this.getAge() >= 18);
	}

	/**
	 * 
	 * Returns Buddy's age
	 * 
	 */

	public int getAge() {

		return this.age;

	}

	/**
	 * sets buddy's age.
	 * 
	 * @param age, new age for buddy
	 */
	public void setAge(int age) {
		this.age = age;
	}

	// address accessors and mutators

	/**
	 * 
	 * Edits Buddy's number
	 * 
	 * @param newNumber
	 * 
	 */

	public void setNumber(String newNumber) {

		this.number = newNumber;

	}

	/**
	 * 
	 * Returns Buddy's number
	 * 
	 * @return String
	 * 
	 */

	public String getNumber() {

		return this.number.toString();

	}

	/**
	 * 
	 * Prints Buddy's Info
	 * 
	 * @return String in the form, "Abdulla Al-wazzan's information is:
	 * 
	 *         age is: 24
	 * 
	 *         number is: 819-5933339
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @override
	 * 
	 */

	@Override

	public String toString() {

		String s1 = this.getName();

		int s2 = this.getAge();

		String s3 = this.getNumber();

		return s1 + "#" + s2 + "#" + s3;

	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof BuddyInfo)) return false;
		
		BuddyInfo tBuddy = (BuddyInfo) o;
		
		return(
		(this.getAge() == tBuddy.getAge()) &&
		(this.getName().equals(tBuddy.getName())) &&
		(this.getNumber().contentEquals(tBuddy.getNumber()))
		);
	}
	
	public static BuddyInfo pimport(String b) {
		Scanner scan = new Scanner(b).useDelimiter("\\scan*#\\s*");
		b.split("#");
		scan.close();
		return new BuddyInfo(name, age, number);
	}

	public static void main(String[] args) {

		System.out.println("Hello World!");

		Scanner scan = new Scanner(System.in); // hello scanner

		String temp1, temp3;
		int temp2;

		System.out.print("Please enter Buddy's name: ");

		temp1 = scan.nextLine();

		System.out.println();

		System.out.print("Please enter Buddy's age: ");

		temp2 = Integer.valueOf(scan.nextLine());

		System.out.println();

		System.out.print("Please enter Buddy's number: ");

		temp3 = scan.nextLine();

		System.out.println();

		scan.close(); // bye scanner

		BuddyInfo b = new BuddyInfo(temp1, temp2, temp3);

		b.setName("paul");

		b.getName();

		System.out.println(b.toString());

		// TODO Auto-generated method stub

	}

}
