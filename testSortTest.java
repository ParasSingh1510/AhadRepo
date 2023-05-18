package AssertMethosAndAnnotations;

import org.junit.Test;



public class testSortTest {
	
	TestSort ts = new TestSort();
	
	@Test
	public void testSortValues() {
		assertEquals({1,2,3,4,5} ,ts.Sorting({5,4,1,3,2}));
	}

}
