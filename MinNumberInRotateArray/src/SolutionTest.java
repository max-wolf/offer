import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	Solution slt = new Solution();

	@Test
	public void testMinNumberInRotateArray() {
		int[] array = {1,0,1,1,1};
		assertEquals(0, slt.minNumberInRotateArray(array));
	}

	@Test
	public void testSequentialSearch() {
		
	}

}
