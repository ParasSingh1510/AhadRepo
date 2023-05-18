package AssertMethosAndAnnotations;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class checkPresenceTest {
	
	checkPresence cp = new checkPresence();
	
	@Test
	public void testPresence() {
		assertTrue(cp.checkpresence("hello", "hell"));
	}
	
}
