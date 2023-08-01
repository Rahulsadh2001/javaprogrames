import java.util.Arrays;

public class Shortingsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={2,3,4,5,6};

int sum =0;
	Arrays.sort(nums);
	  int total =nums.length;
int ss=nums[total-1]+nums[total-2]+nums[total-3]+nums[total-4];
System.out.println(ss);
	for(int i=0;i<nums.length;i++) {
	//	System.out.println(nums[i]);
	}
	//System.out.println(nums);
           
		for(int i=1;i<5;i++) {
			sum=nums[(total-i)]+sum;
			//System.out.println(sum);
		}//int t=sum-nums[0];
		System.out.println(sum);
		
	}

}
