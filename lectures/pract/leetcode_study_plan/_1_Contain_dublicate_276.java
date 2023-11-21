package leetcode_study_plan;

public class _1_Contain_dublicate_276 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums  = {1,2,3,1};
		System.out.println(print(nums));
	}
	public static boolean print(int[] nums) {
		
		int i = 0;
		int j = i+1;
		while(i<=j) {
			if (nums[i] == nums[j]) {
				return true;
			}
		
		
		
		i++;
		j++;
		
		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
}
		return false;
	}
}
