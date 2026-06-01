package Math.leetcode.Again;

public class Maths_2485_FindThePivotInteger {
	public static int pivotInteger(int n) {
		if(n==1)
			return n;
		int sum0fn = n*(n+1)/2;
		for(int i=1; i<=n;i++){
			int sumi=i*(i+1)/2;
			if((sum0fn+i)-sumi==sumi){
				return i;
	                }
			}
		return -1;
		}
	public static void main(String[] args) {
		System.out.println(pivotInteger(38));
		}
	}
