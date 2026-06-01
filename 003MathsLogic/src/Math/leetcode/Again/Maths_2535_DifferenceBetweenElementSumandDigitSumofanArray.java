package Math.leetcode.Again;

public class Maths_2535_DifferenceBetweenElementSumandDigitSumofanArray {
	public  static int differenceOfSum(int[] nums) {
        int esum=0;
        int digitsum=0;
     
        for(int i=0;i<nums.length;i++){
            esum+= nums[i];
            if(nums[i]<9){
                digitsum+=nums[i];
                 }else{
                    int t =nums[i];
                    while(t!=0){
                        int take=t%10;
                         digitsum+=take;
                         t/=10;

                    }
                 }
        }

        int ret = esum -digitsum;
        if(ret<0)
        return -1*ret;
        else
        return ret;
    }

	public static void main(String[] args) {
		int a []= {1,9,10};
		System.out.println(differenceOfSum(a));
		char  s='1';
		System.out.println(s-49);
	

	}

}
