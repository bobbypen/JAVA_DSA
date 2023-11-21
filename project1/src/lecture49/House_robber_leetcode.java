package lecture49;

public class House_robber_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,7,9,3,1};
		int [] dp = new int [arr.length];
		 for(int i = 0; i< dp.length; i++){
		        dp[i] = -1;
		    }
		System.out.println(Robber(arr,0));

	}
	
	public static int RobberTD(int [] arr, int i, int[] dp) {
		if (i>=arr.length) {
			return 0;
		}
		
		if (dp[i] != -1) {
			return dp[i];
		}
		
		int rob = arr[i] + RobberTD(arr,i+2,dp);
		int dontrob = RobberTD(arr,i+1,dp);
		return dp[i] = Math.max(rob, dontrob);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int Robber(int arr[], int i) {
		if (i>=arr.length) {
			return 0;
		}
		
		int rob = arr[i] + Robber(arr,i+2);
		int dontrob = Robber(arr,i+1);
		return Math.max(rob, dontrob);
		
	}

}
