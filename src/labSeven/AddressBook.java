package labSeven;

import java.util.*;
import java.io.*;

public class AddressBook {
	private int count;
	private ArrayList<BuddyInfo> buddies; // ArrayList to contain BuddyInfo objects

	/**
	 * 
	 * constructor, initializes ArrayList, list
	 * 
	 */

	public AddressBook() {

		this.buddies = new ArrayList<>();
		this.count = buddies.size();
	}

	/**
	 * 
	 * 
	 * 
	 * @param o, desired BuddyInfo to enter in address book
	 * 
	 * @throws null pointer exception if object to be added is null
	 * 
	 */

	public void addBuddy(BuddyInfo o) {

		if (o == null) {

			throw new NullPointerException("Nothing to add");

		}

		else {

			this.buddies.add(o);

		}

	}

	/**
	 * returns size of address book.
	 * 
	 * @return count, size of list.
	 */
	public int getSize() {
		return this.buddies.size();
	}

	/**
	 * returns true if address book is empty.
	 * 
	 * @return boolean, true, if address book is empty false, otherwise
	 */
	public boolean isEmpty() {
		return (this.getSize() == 0);
	}

	/**
	 * clears address book by implicitly creating a new list.
	 */
	public void clear() {
		this.buddies = new ArrayList<>();
	}

	/**
	 * 
	 * 
	 * 
	 * @param o, indicates which buddy to remove.
	 * 
	 */

	public void removeBuddy(int index) {

		if ((index < 0) || (index >= buddies.size())) {

			throw new IllegalArgumentException("Out of bounds idiot!!");

		}
		if (this.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		} else {
			this.buddies.remove(index);
		}
	}

	/**
	 * 
	 * returns 1st instance of desired Buddy
	 * 
	 * @return buddyInfo buddy
	 * 
	 */

	public BuddyInfo getBuddy(String name) {

		for (int i = 0; i < buddies.size(); i++) {

			if (buddies.get(i).getName().equals(name)) {

				return buddies.get(i);

			}

		}

		return null;

	}
	
	public void save(String filename) throws IOException {
		PrintWriter pw = new PrintWriter(filename);
		
		for (BuddyInfo buddy : buddies) {
			pw.println(buddy.toString());
			
		}
		pw.close();
	}
	

	public static void main(String[] args) throws IOException {
		

		System.out.println("Address book");

			BuddyInfo buddy0 = new BuddyInfo("pawool", 24, "613 0000001");

			AddressBook af = new AddressBook();

			af.addBuddy(buddy0);

		System.out.println("hello " + buddy0.getName());

			BuddyInfo buddy1 = new BuddyInfo("Abdulla", 24, "1234567");

			af.addBuddy(buddy1);
			String s = "filenameTest";
			af.save(s);

		System.out.println("hello " + buddy1.getName());

			buddy0.setName("name");

		System.out.println("Bye " + buddy1.getName());

		if (af.buddies.isEmpty()) {

			System.out.println("address book is empty.");

		}

		else {

			for (int i = 0; i < af.buddies.size(); i++) {

				System.out.println(af.buddies.get(i).toString());

			}

		}
		

	}

}