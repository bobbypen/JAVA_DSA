package lecture;

public class lecture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pri = 1000;
		int rate = 2;
		int time = 1;
		
		int si = (pri*rate*time)/100;
		System.out.println(si);
		if(si <= 10) {
		System.out.println("IS IT Okay");
		}
		else if(si <= 15 ) {
			System.out.println("high rate");
		}
		else {
			System.out.println("maa chuda");
		}
	int s = 5;
	int k = 11;
	if(s>k) {
	System.out.println("s is greater");
	}else {
	System.out.println("k is greater");
	}
	
	int n = 10;
	int su = 0;
	int i = 1 ; 
	while( i<=10) {
	su = su + i;
	i++;
	
	
	}
	System.out.println(su);
	}
	
	
	
	}
	

