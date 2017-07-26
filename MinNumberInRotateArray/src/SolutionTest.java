import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	Solution slt = new Solution();

	@Test
	public void testMinNumberInRotateArray() {
		int[] array = {3,4,5,1,2};
		assertEquals(1, slt.minNumberInRotateArray(array));
	}

}
