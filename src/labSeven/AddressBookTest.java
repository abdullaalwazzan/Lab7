package labSeven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {
	private AddressBook aBook = null;
	private BuddyInfo me = null;
	private BuddyInfo him = null;

	@Before
	public void setUp() throws Exception {
		aBook = new AddressBook();
		me = new BuddyInfo("Abdulla", 24, "8195933339");
		him = new BuddyInfo("Obama", 23, "0000000001");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddBuddy() {
		aBook.addBuddy(me);
		aBook.addBuddy(him);
		assertEquals(2, aBook.getSize());
	}

	@Test
	public void testGetSize() {
		aBook.addBuddy(me);
		aBook.addBuddy(him);
		assertEquals(2, aBook.getSize());
	}

	@Test
	public void testIsEmpty() {
		aBook.addBuddy(me);
		aBook.addBuddy(him);
		aBook.clear();
		assertEquals(0, aBook.getSize());
	}

	@Test
	public void testClear() {
		aBook.addBuddy(me);
		aBook.addBuddy(him);
		aBook.clear();
		assertEquals(0, aBook.getSize());
		
	}

	@Test
	public void testRemoveBuddy() {
		aBook.addBuddy(me);
		aBook.removeBuddy(0);
		assertEquals(0, aBook.getSize());
		assertEquals(true, aBook.isEmpty());
	}
}
