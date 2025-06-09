package ABC;

public class Integersquareroot {

	public static int integerSqrt(int n) {
		if(n<0) {
			throw new
			IllegalArgumentException("Square root is not defined for negative numbers.");
		}
		if(n==0||n==1) {
			return n;
			
		}
		int start=0,end=n,result=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<=n/mid) {
				result=mid;
				start=mid+1;
			
			}
			else {
				end=mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int n=27;
		System.out.println("The integer part of the square root of"+n+"is"+integerSqrt(n));
		
		// TODO Auto-generated method stub

	}

}
