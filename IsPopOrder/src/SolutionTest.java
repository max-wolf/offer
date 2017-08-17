import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testIsPopOrder() {
		int[] a = {1,2,3,4,5};
		int[] b = {4,3,5,1,2};
		assertEquals(true, new Solution().IsPopOrder(a, b));
	}

}
