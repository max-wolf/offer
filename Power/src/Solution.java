
public class Solution {
	public double Power(double base, int exponent) {
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		int absEx = exponent;
		if(exponent < 0)
			absEx = -exponent;
		double result = Power(base, absEx >> 1);
		result *= result;
		if((absEx & 0x1) == 1)
			result *= base;
		if(exponent < 0)
			result = 1.0/result;
		return result;
	}
}
