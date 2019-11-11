package labSeven;

import static org.junit.Assert.*;

import java.util.StringTokenizer;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {

	private BuddyInfo me = null;
	private BuddyInfo him = null;
	
	@Before
	public void setUp() throws Exception {
		me = new BuddyInfo("Abdulla", 24, "8195933339");
		him = new BuddyInfo("Obama", 1, "0000000001");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetName() {
		me.setName("Saleh");
		assertEquals("Name is set to Saleh", "Saleh", me.getName());
	}

	@Test
	public void testGetName() {
		assertEquals("Abdulla", me.getName());
	}

	@Test
	public void testIsOver18() {
		assertTrue(me.isOver18());
		assertFalse(him.isOver18());
		assertEquals("buddy is over 18", true, me.isOver18());
		assertEquals("him is NOT over 18", false, him.isOver18());
	}

	@Test
	public void testSetAge() {
		me.setAge(8);
		assertEquals(8, me.getAge());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(24, me.getAge());
	}

	@Test
	public void testGetNumber() {
		assertEquals("8195933339", me.getNumber());
	}
	
	
	@Test
	//also tests toString()
	public void testCopyConstructor() {
		BuddyInfo testBuddy = new BuddyInfo(me);
		
		
		assertEquals(me, testBuddy);
	}
	
	@Test
	public void testPimport() {
		String line = "";
		System.out.println("Please enter string:");
		
		Scanner scan = new Scanner(System.in);
		line = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(line);
		while(st.hasMoreTokens()) {
			if(!(st.nextToken().equals("#"))) {
				line += st.nextToken();
			}
		}
		
		BuddyInfo testBuddy = new BuddyInfo();
		
		scan.close();
		assertEquals(me, testBuddy);
		
		
	}          

}



	